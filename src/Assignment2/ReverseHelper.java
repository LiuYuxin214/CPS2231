package Assignment2;

import java.util.Scanner;

public class ReverseHelper {
    public static int pos = 0, size = 0;
    public static char[] c = new char[10000];

    public static String reverse(String s, int high) {
        c[pos] = s.charAt(high);
        pos++;
        if (pos != size)
            return reverse(s, high - 1);
        else {
            String result = new String(c);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        size = s.length();
        String result = reverse(s, size - 1);
        System.out.print("The reverse is ");
        for (int i = 0; i < size; i++) {
            System.out.print(result.charAt(i));
        }
    }

}
