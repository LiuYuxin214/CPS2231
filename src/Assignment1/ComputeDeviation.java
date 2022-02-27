package Assignment1;

import java.util.Scanner;

//Purpose: Calculate the mean and standard deviation of the data
//Main idea: Mean and standard deviation formula
public class ComputeDeviation {

    /** Compute the deviation of double values */
    public static double deviation(double[] x) {
        double mean = mean(x);
        double sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += Math.pow((x[i] - mean), 2);
        }
        sum = sum / (10 - 1);
        sum = Math.sqrt(sum);
        return sum;
    }

    /** Compute the mean of an array of double values */
    public static double mean(double[] x) {
        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            sum += x[i];
        }
        double mean = sum / 10.0;
        return mean;
    }

    public static void main(String[] args) {
        //1. Get the input from the user
        double[] num = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextDouble();
        }
        //2. Calculate the mean and the standard deviation
        System.out.println("The mean is " + mean(num));
        //3. Display the result
        System.out.println("The standard deviation is " + deviation(num));
    }

}
