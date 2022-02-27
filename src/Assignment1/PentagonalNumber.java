package Assignment1;

//Purpose: Show the pentagonal numbers
//Main idea: n * (3 * n - 1) / 2
public class PentagonalNumber {

    public static int getPentagonalNumber(int n) {
        int result = n * (3 * n - 1) / 2;
        return result;
    }

    public static void main(String[] args) {
        //1.Display the pentagonal numbers
        int num = 1;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.printf("%7d", getPentagonalNumber(num));
                num++;
            }
            System.out.println("");
        }
    }

}
