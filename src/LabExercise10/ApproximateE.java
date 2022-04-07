package LabExercise10;

import java.math.BigDecimal;

public class ApproximateE {
    public static BigDecimal bigFactorial(BigDecimal bd) {
        if (bd.compareTo(new BigDecimal(1)) == 0)
            return bd;
        else
            return bd.multiply(bigFactorial(bd.subtract(new BigDecimal(1))));
    }

    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal e = new BigDecimal(1);
            int j = 1;
            while (j <= i) {
                e = e.add(new BigDecimal(1).divide(bigFactorial(new BigDecimal(j)), 25, BigDecimal.ROUND_UP));
                j++;
            }
            System.out.println("i = " + i + " e = " + e);
        }
    }
}
