package Assignment3;

public class LargestRowAndColumn {

    public static void main(String[] args) {
        int[][] m = new int[5][5];
        random(m);
        show(m);
        System.out.println("The largest row index: " + maxRowIndex(m));
        System.out.println("The largest column index: " + maxColumnIndex(m));
    }

    public static void random(int[][] m) {
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++) {
                if (Math.random() < 0.5)
                    m[i][j] = 0;
                else
                    m[i][j] = 1;
            }
    }

    public static int maxRowIndex(int[][] m) {
        int sum = 0, maxRowIndex = 0, max = 0;

        for (int i = 0; i < m.length; i++) {
            sum = 0;
            for (int j = 0; j < m[i].length; j++)
                sum += m[i][j];
            if (sum > max) {
                max = sum;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }

    public static int maxColumnIndex(int[][] m) {
        int sum = 0, maxColumnIndex = 0, max = 0;

        for (int i = 0; i < m.length; i++) {
            sum = 0;
            for (int j = 0; j < m[i].length; j++)
                sum += m[j][i];
            if (sum > max) {
                max = sum;
                maxColumnIndex = i;
            }
        }
        return maxColumnIndex;
    }

    public static void show(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}