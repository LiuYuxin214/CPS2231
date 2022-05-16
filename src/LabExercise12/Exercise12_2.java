package LabExercise12;

import java.util.Scanner;

public class Exercise12_2 {

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Please enter a month number (1-12): ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        try {
            System.out.println("Month " + months[month - 1] + " has " + dom[month - 1] + " days.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong Number");
        }
    }
}
