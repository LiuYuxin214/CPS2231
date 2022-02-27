package Assignment1;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        long creditCardNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        creditCardNumber = input.nextLong();
        if (isValid(creditCardNumber)) System.out.println(creditCardNumber + " is valid");
        else System.out.println(creditCardNumber + " is invalid");
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        if ((13 <= getSize(number) && getSize(number) <= 16) && (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0))
            return true;
        else return false;
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        String numberString = String.valueOf(number);
        int sum = 0;
        for (int i = getSize(number) - 2; i >= 0; i -= 2)
            sum += getDigit(2 * Integer.parseInt(String.valueOf(numberString.charAt(i))));
        return sum;
    }

    /**
     * Return this number if it is a single digit, otherwise,
     * return the sum of the two digits
     */
    public static int getDigit(int number) {
        if (number <= 9) return number;
        else return (number / 10 + number % 10);
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        String numberString = String.valueOf(number);
        int sum = 0;
        for (int i = getSize(number) - 1; i >= 0; i -= 2)
            sum += Integer.parseInt(String.valueOf(numberString.charAt(i)));
        return sum;
    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        return d == getPrefix(number, getSize(d));
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        String dString = String.valueOf(d);
        return dString.length();
    }

    /**
     * Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        if (getSize(number) < k) return number;
        long prefixNumber = number / (long) Math.pow(10, getSize(number) - k);
        return prefixNumber;
    }
}