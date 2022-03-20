package Assignment2;

import java.util.Scanner;

public class ReverseHelper {

    public static void reverseDisplay(String s) {
        if (s.length() > 0) {
            System.out.print(s.charAt(s.length() - 1));
            reverseDisplay(s.substring(0, s.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String s = input.nextLine();
        System.out.print("The reversed: " + s + " is ");
        reverseDisplay(s);
    }

}
