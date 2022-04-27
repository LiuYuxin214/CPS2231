package LabExercise11;

import java.util.ArrayList;

public class Shuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        shuffle(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }

    public static void shuffle(ArrayList<Integer> array) {
        int randomIndex;
        int temp;
        for (int i = 0; i < array.size(); i++) {
            randomIndex = (int) (Math.random() * array.size());
            temp = array.get(randomIndex);
            array.set(randomIndex, array.get(i));
            array.set(i, temp);
        }
    }
}
