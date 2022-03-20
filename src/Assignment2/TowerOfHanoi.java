package Assignment2;

import java.util.Scanner;

public class TowerOfHanoi {

    public static long hanoi(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 2 * hanoi(n - 1) + 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of disks: ");
        int disks = scanner.nextInt();
        System.out.println("The number of moves: " + hanoi(disks));
    }

}
