package Assignment1;

import java.util.Scanner;

//Purpose: Calculate the mean and standard deviation of the data
//Main idea: Mean and standard deviation formula
public class AverageAndStandardDeviation {

    public static void main(String[] args) {
        //1.Get the input from the user
        double[] num = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextDouble();
        }
        //2.Calculate the mean and the standard deviation
        double mean = 0;
        double sd = 0;
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += num[i];
        }
        mean = sum / 10.0;

        double sum2 = 0;
        for (int i = 0; i < 10; i++) {
            sum2 += Math.pow(num[i], 2);
        }
        sd = Math.sqrt((sum2 - Math.pow(sum, 2) / 10) / (10 - 1));
        //3.Display the result
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + sd);
    }

}
