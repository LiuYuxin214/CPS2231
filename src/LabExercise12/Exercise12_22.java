package LabExercise12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_22 {

    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_22 dir oldString newString");
            System.exit(1);
        }

        // Check if source directory exists
        File dir = new File(args[0]);
        if (!dir.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // Check if source directory is a directory
        if (!dir.isDirectory()) {
            System.out.println(args[0] + " is not a directory");
        }

        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            ArrayList<String> lines = new ArrayList<>();
            try (
                    Scanner input = new Scanner(file)

            ) {
                while (input.hasNext()) {
                    String s1 = input.nextLine();
                    String s2 = s1.replaceAll(args[1], args[2]);
                    lines.add(s2);
                }
            }
            try (
                    PrintWriter output = new PrintWriter(file)
            ) {
                for (int j = 0; j < lines.size(); j++) {
                    output.println(lines.get(j));
                }
            }
        }
    }
}
