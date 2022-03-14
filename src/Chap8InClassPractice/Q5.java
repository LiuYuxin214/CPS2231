package Chap8InClassPractice;

public class Q5 {

    public static void main(String[] args) {
        double[][][] array = new double[5][4][2];
        for (int i = 0; i <= 4; i++)
            for (int j = 0; j <= 3; j++)
                for (int n = 0; n <= 1; n++)
                    array[i][j][n] = Math.random() * 100;

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                for (int n = 0; n <= 1; n++)
                    System.out.print(array[i][j][n] + " ");
                System.out.println();
            }
            System.out.println();
        }

        double sum = 0;
        for (int i = 0; i <= 4; i++)
            for (int j = 0; j <= 3; j++)
                for (int n = 0; n <= 1; n++)
                    sum += array[i][j][n];
        System.out.println("sum: " + sum);

        double max = array[0][0][0];
        for (int i = 0; i <= 4; i++)
            for (int j = 0; j <= 3; j++)
                for (int n = 0; n <= 1; n++)
                    if (max < array[i][j][n])
                        max = array[i][j][n];
        System.out.println("max: " + max);

        double min = array[0][0][0];
        for (int i = 0; i <= 4; i++)
            for (int j = 0; j <= 3; j++)
                for (int n = 0; n <= 1; n++)
                    if (min > array[i][j][n])
                        min = array[i][j][n];
        System.out.println("min: " + min);

        double arrange = sum / 40;
        System.out.println(arrange);
        int count = 0;
        for (int i = 0; i <= 4; i++)
            for (int j = 0; j <= 3; j++)
                for (int n = 0; n <= 1; n++) {
                    if (array[i][j][n] > arrange) {
                        count++;
                    }
                }
        System.out.println(count);

    }

}
