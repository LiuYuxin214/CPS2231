package Assignment1;

import java.util.Scanner;

//Purpose: Convert decimal numbers to binary numbers
//Main idea: 
public class DecToBin {

    public static void main(String[] args) {
        //1.Enter decimal number
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter decimal number: ");
        int dec = input.nextInt();
        int showNum = dec;
        int bin = 0;
        int times = 0;
        int[] num = new int[1000];
        //2.Convert decimal numbers to binary numbers
        while (dec >= 2) {
            times++;
            num[times] = dec % 2;
            dec /= 2;
        }
        num[times + 1] = dec;
        //3.Output binary number
        System.out.print("The binary number corresponding to " + showNum + " is ");
        for (int i = times + 1; i >= 1; i--) {
            System.out.print(num[i]);
        }
    }

}
