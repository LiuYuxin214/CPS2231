package Assignment2;

import java.util.Scanner;

public class CheckSorted {
    public static boolean compare(int a, int b) {
        return a <= b;
    }

    public static boolean isSorted(int[] s, int begin) {
        int len = s.length - 1;
        while (begin < len) {
            if (compare(s[begin], s[begin + 1])) {
                begin++;
                isSorted(s, begin);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[6];
        System.out.print("Enter the list: ");
        for (int i = 0; i <= 5; i++)
            array[i] = input.nextInt();
        if (isSorted(array, 0) == true)
            System.out.print("The list is sorted.");
        if (isSorted(array, 0) == false)
            System.out.print("The list is not sorted.");
    }

}
