package Assignment2;

import java.util.Scanner;

public class DescendingBubbleSort {

    public static void DescendingBubbleSort(int[] num) {
        int temp;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j + 1] > num[j]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of numbers: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        DescendingBubbleSort.DescendingBubbleSort(numbers);
        System.out.print("Result: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
        }
    }

}
