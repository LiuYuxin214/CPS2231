package Workshop;

//O(n)~O(n log n)
public class BucketSort {

    public static void bucketSort(int[] arr) {
        //分桶，这里采用x/10。
        //数据为1~99之间的数字
        int interval = 10;//桶的间隔
        int[][] bucket = new int[interval][arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = arr[i] / interval;   //这里使用x/10,count为桶号
            for (int j = 0; j < arr.length; j++) {
                if (bucket[count][j] == 0) {
                    bucket[count][j] = arr[i];
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
