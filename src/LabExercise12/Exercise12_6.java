package LabExercise12;

import java.util.Scanner;

public class Exercise12_6 {
    /**
     * Main method
     */
    public static void main(String[] args) throws NumberFormatException {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        if (hex.length() == 0 || !isHex(hex)) {
            throw new NumberFormatException();
        }
        System.out.println("The decimal value for hex number "
                + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static boolean isHex(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            if (ch < '0' || (ch > '9' && ch < 'A') || ch > 'F')
                return false;
        }
        return true;
    }

    public static int hexCharToDecimal(char ch) {
        if ('A' <= ch && ch <= 'F')
            return 10 + ch - 'A';
        else // ch is '0', '1', ..., or '9'
            return ch - '0';
    }
}