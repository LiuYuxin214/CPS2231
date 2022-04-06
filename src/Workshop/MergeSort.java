package Workshop;

//O(n log n)
public class MergeSort {
    public static void MergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            MergeSort(a, low, mid);
            MergeSort(a, mid + 1, high);
            //左右分别归并排序
            merge(a, low, mid, high);
        }
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 用temp数组中排序好的数覆盖a数组
        for (int n = 0; n < temp.length; n++) {
            a[n + low] = temp[n];
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 1, 3, 7, 9, 8, 5};
        MergeSort(a, 0, a.length - 1);
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}
