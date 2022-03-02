package Assignment2;

import java.util.Scanner;

public class Reverse {

    public static String reverse(String s) {
        int size = s.length();
        char[] c = new char[size];
        int pos = 0;
        for (int i = size - 1; i >= 0; i--) {
            c[pos] = s.charAt(i);
            pos++;
        }
        String r = new String(c);
        return r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("The reverse is " + reverse(s));
    }
}
