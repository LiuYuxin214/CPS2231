package Assignment2;

import java.util.Scanner;

public class FibonacciSeriesTail {

    public static int fibonacci(int n, int pre, int cur) {
        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return cur;
        }
        return fibonacci(n - 1, cur, pre + cur);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The fibonacci is " + fibonacci(num, 0, 1));
    }

}
