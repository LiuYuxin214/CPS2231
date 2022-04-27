package LabExercise11;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {

    public static int getPerfectSquares(int n) {
        int result = 1, l = 0;
        int[] factors = findFactors(n);
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] == 0) {
                l = factors[i - 1];
                break;
            }
        }
        int[] count = new int[l + 1];
        for (int i = 0; i < factors.length; i++) {
            count[factors[i]]++;
        }
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 != 0) {
                temp.add(i);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            result *= temp.get(i);
        }
        return result;
    }

    public static int[] findFactors(int n) {
        int[] factors = new int[n];
        int i = 2, j = 0;
        while (n != 1) {
            if (n % i == 0) {
                factors[j] = i;
                j++;
                n = n / i;
            } else {
                do {
                    i++;
                } while (!isPrime(i));
            }
        }
        return factors;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        int n = getPerfectSquares(m);
        System.out.println("T " + n);
        System.out.println("m * n is " + n * m);
    }
}
