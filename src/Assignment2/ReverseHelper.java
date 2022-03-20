package Assignment2;

import java.util.Scanner;

public class ReverseHelper {

    public static void reverseDisplay(String values) {
        if (values.length() > 0) {
            System.out.print(values.charAt(values.length() - 1));
            reverseDisplay(values.substring(0, values.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print("The reversed: " + s + " is ");
        reverseDisplay(s);
    }

}
