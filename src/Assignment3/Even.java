package Assignment3;

public class Even {

    public static void main(String[] args) {

        int[][] m = new int[6][6];
        random(m);
        show(m);
        if (judge(m) == true) System.out.println("Yes");
        else System.out.println("No");
    }

    public static void random(int[][] m) {
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m.length; j++) {
                if (Math.random() < 0.5)
                    m[i][j] = 0;
                else
                    m[i][j] = 1;
            }
    }

    public static boolean judge(int[][] m) {
        int rowSum, columnSum;
        for (int i = 0; i < m.length; i++) {
            rowSum = columnSum = 0;
            for (int j = 0; j < m.length; j++) {
                rowSum += m[i][j];
                columnSum += m[j][i];
            }
            if ((rowSum % 2 != 0) || (columnSum % 2 != 0)) return false;
        }
        return true;
    }

    public static void show(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

}
