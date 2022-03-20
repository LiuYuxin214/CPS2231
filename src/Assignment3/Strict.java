package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Strict {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];
        System.out.print("Enter list1: ");
        for (int i = 0; i < list1.length; i++)
            for (int j = 0; j < list1[i].length; j++)
                list1[i][j] = input.nextInt();
        System.out.print("Enter list2: ");
        for (int i = 0; i < list2.length; i++)
            for (int j = 0; j < list2[i].length; j++)
                list2[i][j] = input.nextInt();
        if (equals(list1, list2))
            System.out.println("The two arrays are strictly identical");
        else
            System.out.println("The two arrays are not strictly identical");
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m2.length; i++)
            if (Arrays.equals(m1[i], m2[i]) == false)
                return false;
        return true;
    }
}
