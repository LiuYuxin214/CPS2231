package LabExercise13;

import java.util.ArrayList;

public class Exercise13_02 {

    public static void average(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("Average: " + sum / list.size());
    }
}
