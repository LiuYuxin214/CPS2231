package LabExercise12;

import java.io.File;
import java.util.Scanner;

public class Exercise12_26 {

    public static void main(String[] args) {
        System.out.print("Please enter the directory name: ");
        Scanner input = new Scanner(System.in);
        String dirName = input.nextLine();
        File dir = new File(dirName);
        if (dir.exists()) {
            System.out.println("The directory exists.");
        } else if (dir.mkdirs()) {
            System.out.println("Directory created successfully");
        }
    }
}
