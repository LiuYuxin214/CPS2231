package Assignment2;

import java.util.Scanner;

import static java.lang.System.exit;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = input.nextInt();
        System.out.print("The binary number is: ");
        if (num == 0) {
            System.out.print("0");
            exit(0);
        }
        dec2Bin(num);
    }

    public static void dec2Bin(int value) {
        if (value == 0)
            return;
        dec2Bin(value / 2);
        System.out.printf("%d", value % 2);
    }

}
