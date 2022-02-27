package Assignment1;

import java.util.*;

//Purpose: read the integers between 1 and 50 and counts the occurrences of each
//Main idea: array
public class OccurrenceOfNumbers {

    public static void main(String[] args) {
        //1.Enter and record the number of times
        Scanner input=new Scanner(System.in);
        int in;
        int[] num= new int[51];
        for(int i=0;i<=50;i++) num[i]=0;
        System.out.print("Enter the integers between 1 and 50: ");
        while(true){
            in = input.nextInt();
            if(in == 0) break;
            num[in]++;
        }
        //2.Display the result
        for(int i=1;i<=50;i++){
            if(num[i]!=0){
                System.out.println(i+" occurs "+num[i]+" times ");
            }
        }
    }

}
