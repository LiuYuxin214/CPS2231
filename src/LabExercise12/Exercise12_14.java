package LabExercise12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_14 {

    public static int readInFile(String line, File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int lineNumber = 0;
        while (scanner.hasNextLine()) {
            lineNumber++;
            String thisLine = scanner.nextLine();
            if (thisLine.contains(line)) {
                return lineNumber;
            }
        }
        return -1;
    }
}
