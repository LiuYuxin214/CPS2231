package LabExercise10;

import java.math.BigDecimal;

public class LargePrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        final long LONG_MAX = Long.MAX_VALUE;
        String bigStart = LONG_MAX + "";
        BigDecimal bigNum = new BigDecimal(bigStart);
        while (count < 5) {
            BigDecimal factor = new BigDecimal(2);
            boolean isPrime = true;
            while (bigNum.compareTo(factor) > 0) {
                if (bigNum.remainder(factor).compareTo(new BigDecimal(0)) == 0) {
                    isPrime = false;
                    break;
                }
                factor = factor.add(new BigDecimal(1));
            }
            if (isPrime) {
                System.out.println(bigNum + " is a prime number");
                count++;
            }
            bigNum = bigNum.add(new BigDecimal(1));
        }
    }
}