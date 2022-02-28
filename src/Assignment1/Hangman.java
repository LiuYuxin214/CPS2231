package Assignment1;

import java.util.Scanner;

public class Hangman {

    public static int Guess(String str) {
        Scanner input = new Scanner(System.in);
        int count = 0, number = str.length();
        char[] present = new char[number];
        for (int i = 0; i < number; i++) {
            present[i] = '*';
        }
        while (true) {
            System.out.print("(Guess) Enter a letter in word ");
            for (int i = 0; i < str.length(); i++) {
                System.out.print(present[i]);
            }
            System.out.print(" > ");
            String letter = input.next();
            int m = 0;
            for (int i = 0; i < str.length(); i++) {
                if (present[i] == letter.charAt(0)) {
                    System.out.println("     " + letter + " is already in the word");
                    m = 1;
                } else if (str.charAt(i) == letter.charAt(0)) {
                    present[i] = letter.charAt(0);
                    number--;
                    m = 1;
                }
            }
            if (m == 0) {
                System.out.println("     " + letter + " is no in the word");
                count++;
            }
            if (number == 0)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            String[] words = {"write", "that", "program", "science", "computer"};
            int pos = (int) (Math.random() * 5);
            String str = words[pos];
            int n = Guess(str);
            System.out.println("The word is " + str + ". You missed " + n + " time.");
            System.out.print("Do you want to guess for another word? Enter y or n>");
            String s = input.next();
            if (s.equals("n")) break;
        }
        System.out.println("Game over!");
    }

}

