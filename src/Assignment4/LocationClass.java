package Assignment4;

import java.util.Scanner;

class Location {
    public int row, column;
    public double maxValue;
    public double[][] nums;

    Location() {

    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        location.nums = a;
        location.row = 0;
        location.column = 0;
        location.maxValue = -1;
        int temprow = location.nums.length;
        int tempcolumn = location.nums[0].length;
        for (int i = 0; i < temprow; i++) {
            for (int j = 0; j < tempcolumn; j++) {
                if (location.nums[i][j] > location.maxValue) {
                    location.maxValue = location.nums[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }

}

public class LocationClass {

    public static void main(String[] args) {
        int row, column;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        row = input.nextInt();
        column = input.nextInt();
        double[][] num = new double[row][column];
        System.out.println("Enter the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                num[i][j] = input.nextDouble();
            }
        }
        Location result = Location.locateLargest(num);
        System.out.println("The location of the largest element is " + result.maxValue + " at (" + result.row + ", " + result.column + ")");
    }


}