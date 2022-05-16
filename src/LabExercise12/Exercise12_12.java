package LabExercise12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_12 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        ArrayList<String> result = new ArrayList<>();
        for (int j = 0; j < lines.size(); j++) {
            if (!lines.get(j).contains("{")) {
                if (j + 1 >= lines.size()) {
                    break;
                }
                if (lines.get(j + 1).contains("{")) {
                    result.add(lines.get(j) + " {");
                } else {
                    result.add(lines.get(j));
                }
            }
        }
        PrintWriter out = new PrintWriter(file);
        for (int j = 0; j < result.size(); j++) {
            out.println(result.get(j));
        }
        out.println("}");
        out.close();
    }
}
