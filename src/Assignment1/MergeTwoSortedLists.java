package Assignment1;

import java.util.Scanner;

//Purpose: merges two sorted lists into a new sorted list
//Main idea: array
public class MergeTwoSortedLists {

    public static int[] merge(int[] list1, int[] list2) {
        int size = list1[0] + list2[0];
        int[] list = new int[size];
        for (int i = 1; i <= list1[0]; i++) {
            list[i - 1] = list1[i];
        }
        int j = 1;
        for (int i = list1[0]; i < size; i++) {
            list[i] = list2[j];
            j++;
        }
        int[] sort = new int[100000];
        for (int i = 0; i < size; i++) {
            sort[list[i]]++;
        }
        int[] result = new int[size + 1];
        j = 1;
        result[0] = size;
        for (int i = 0; i < 100000; i++) {
            while (sort[i] != 0) {
                result[j] = i;
                j++;
                sort[i]--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //1.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1 + 1];
        list1[0] = size1;
        for (int i = 1; i < size1 + 1; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2 size and contents: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2 + 1];
        list2[0] = size2;
        for (int i = 1; i < size2 + 1; i++) {
            list2[i] = input.nextInt();
        }
        //2.
        System.out.print("list1 is");
        for (int i = 1; i < size1 + 1; i++) {
            System.out.print(" " + list1[i]);
        }
        System.out.println();
        System.out.print("list2 is");
        for (int i = 1; i < size2 + 1; i++) {
            System.out.print(" " + list2[i]);
        }
        System.out.println();
        //3.
        System.out.print("The merged list is");
        int[] result = merge(list1, list2);
        for (int i = 1; i < result[0] + 1; i++) {
            System.out.print(" " + result[i]);
        }
    }

}
