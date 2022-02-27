package Assignment1;

import java.util.Scanner;

//Purpose: prompts the user to enter a string followed by a character
// then displays the number of occurrences of the character in the string
//Main idea: indexOf()
public class OccurrencesOfASpecifiedCharacter {
    public static int count(String str, char a) {
        int size = str.length();
        int pos = 0, result = 0;
        if (str.indexOf(a) != -1) {
            result++;
            int temp;
            pos = str.indexOf(a, pos) + 1;
            while (str.indexOf(a, pos) != -1) {
                result++;
                pos = str.indexOf(a, pos) + 1;
            }
        } else result = 0;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String source = input.nextLine();
        System.out.print("Please enter a character: ");
        String in = input.next();
        char target = in.charAt(0);
        System.out.println(source.indexOf(target, 2));
        System.out.println("There is " + count(source, target) + " character in total");
    }

}
