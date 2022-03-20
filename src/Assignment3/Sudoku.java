package Assignment3;

import java.util.HashSet;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] sudoku = new int[9][9];
        System.out.println("Enter a Sudoku: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = input.nextInt();
            }
        }
        if (judge(sudoku))
            System.out.print("Yes");
        else
            System.out.print("No");

    }

    public static boolean judge(int[][] sudoku) {
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] < 1 || sudoku[i][j] > 9) {
                    return false;
                }
                hashset.add(sudoku[i][j]);
            }
            if (hashset.size() < 9) {
                return false;
            }
            hashset.clear();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                hashset.add(sudoku[j][i]);
            }
            if (hashset.size() < 9) {
                return false;
            }
            hashset.clear();
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        hashset.add(sudoku[k][l]);
                    }
                }
                if (hashset.size() < 9) {
                    return false;
                }
                hashset.clear();
            }
        }
        return true;
    }
}
