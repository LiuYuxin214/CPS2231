package Assignment3;

public class Even {

    public static void main(String[] args) {

        int[][] array = new int[6][6];
        random(array);
        show(array);
        if (judge(array) == true) System.out.println("Yes");
        else System.out.println("No");
    }

    public static void random(int[][] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++) {
                if (Math.random() < 0.5)
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
    }

    public static boolean judge(int[][] array) {
        int rowSum, columnSum;
        for (int i = 0; i < array.length; i++) {
            rowSum = columnSum = 0;
            for (int j = 0; j < array.length; j++) {
                rowSum += array[i][j];
                columnSum += array[j][i];
            }
            if ((rowSum % 2 != 0) || (columnSum % 2 != 0)) return false;
        }
        return true;
    }

    public static void show(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }

}
