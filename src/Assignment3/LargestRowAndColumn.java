package Assignment3;

public class LargestRowAndColumn {

    public static void main(String[] args) {
        int[][] table = new int[4][4];
        random(table);
        show(table);
        System.out.println("The largest row index: " + maxRowIndex(table));
        System.out.println("The largest column index: " + maxColumnIndex(table));
    }

    public static void random(int[][] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                if (Math.random() < 0.5)
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
    }

    public static void show(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }

    public static int maxRowIndex(int[][] array) {
        int sum = 0, maxRowIndex = 0, max = 0;

        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array[i].length; j++)
                sum += array[i][j];
            if (sum > max) {
                max = sum;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }

    public static int maxColumnIndex(int[][] array) {
        int sum = 0, maxColumnIndex = 0, max = 0;

        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array[i].length; j++)
                sum += array[j][i];
            if (sum > max) {
                max = sum;
                maxColumnIndex = i;
            }
        }
        return maxColumnIndex;
    }
}