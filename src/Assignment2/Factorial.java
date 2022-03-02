package Assignment2;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {
        if (n == 1)
            return n;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The factorial is " + factorial(num));
    }

}
