package Assignment1;

import java.util.Scanner;

//Purpose:
//Main idea: 
public class PalindromeInteger {

    // Return the reversal of an integer, e.g., reverse(456) returns 654
    public static int reverse(int number){
        String s1 = number + "";
        int size = s1.length();
        char[] num = new char[size];
        int mark=size-1;
        for(int i=0;i<size;i++){
            num[i]=s1.charAt(mark);
            mark--;
        }
        String s2=new String(num);
        int result = Integer.parseInt(s2);
        return result;
    }
    // Return true if number is a palindrome
    public static boolean isPalindrome(int number){
        if(number == reverse(number)) return true;
        else return false;
    }
    public static void main(String[] args) {
        //1.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num = input.nextInt();
        if(isPalindrome(num)==true)
            System.out.println(num+" is palindrome number");
        else
            System.out.println(num+" is not palindrome number");
    }

}
