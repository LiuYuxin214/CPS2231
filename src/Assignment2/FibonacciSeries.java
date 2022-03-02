package Assignment2;

import java.util.Scanner;

public class FibonacciSeries {

    public static int times = 0;

    public static int fibonacci(int n) {
        times++;
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The fibonacci is " + fibonacci(num));
        System.out.println("A total of " + times + " times");
    }

}
