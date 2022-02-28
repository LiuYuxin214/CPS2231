package Assignment1;

import java.util.Scanner;

//Purpose: Play the hangman game
//Main idea: String
public class Hangman {

    public static int guess(String str) {
        Scanner input = new Scanner(System.in);
        int error = 0, size = str.length();
        char[] present = new char[size];
        for (int i = 0; i < size; i++) {
            present[i] = '*';
        }
        while (true) {
            System.out.print("(Guess) Enter a letter in word ");
            for (int i = 0; i < str.length(); i++) {
                System.out.print(present[i]);
            }
            System.out.print(" > ");
            String letter = input.next();
            boolean hit = false;
            for (int i = 0; i < str.length(); i++) {
                if (present[i] == letter.charAt(0)) {
                    System.out.println("     " + letter + " is already in the word");
                    hit = true;
                } else if (str.charAt(i) == letter.charAt(0)) {
                    present[i] = letter.charAt(0);
                    size--;
                    hit = true;
                }
            }
            if (hit == false) {
                System.out.println("     " + letter + " is no in the word");
                error++;
            }
            if (size == 0) break;
        }
        return error;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            String[] words = {"write", "that", "program", "science", "computer"};
            int pos = (int) (Math.random() * 5);
            String str = words[pos];
            int error = guess(str);
            System.out.println("The word is " + str + ". You missed " + error + " time.");
            System.out.print("Do you want to guess for another word? Enter y or n>");
            String s = input.next();
            if (s.equals("ny")) break;
        }
        System.out.println("Game over!");
    }

}

