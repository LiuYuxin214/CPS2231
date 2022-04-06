package Workshop;

public class BucketSort {

    public static void bucketSort(int[] arr) {
        //分桶，这里采用x/10。
        //输入数据为1~99之间的数字
        int bucketCount = 10;
        int[][] bucket = new int[bucketCount][arr.length];
        for (int i = 0; i < arr.length; i++) {
            int quotient = arr[i] / 10;   //这里使用x/10
            for (int j = 0; j < arr.length; j++) {
                if (bucket[quotient][j] == 0) {
                    bucket[quotient][j] = arr[i];
                    break;
                }
            }
        }
        //小桶排序
        for (int i = 0; i < bucket.length; i++) {
            //插入排序
            for (int j = 1; j < bucket[i].length; ++j) {
                if (bucket[i][j] == 0) {
                    break;
                }
                int value = bucket[i][j];
                int position = j;
                while (position > 0 && bucket[i][position - 1] > value) {
                    bucket[i][position] = bucket[i][position - 1];
                    position--;
                }
                bucket[i][position] = value;
            }

        }
        //输出
        for (int i = 0, index = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i].length; j++) {
                if (bucket[i][j] != 0) {
                    arr[index] = bucket[i][j];
                    index++;
                } else {
                    break;
                }
            }
        }
    }

}
