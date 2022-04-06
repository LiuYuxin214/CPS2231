package LabExercise10;

public class MyInteger {
    int value;

    public MyInteger() {

    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.value;
    }

    public static int parseInt(char[] arr) {
        String str = new String(arr);
        return Integer.parseInt(str);
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(5);
        System.out.println(myInteger.isEven());
        System.out.println(myInteger.isOdd());
        System.out.println(myInteger.isPrime());
        System.out.println(MyInteger.isEven(5));
        System.out.println(MyInteger.isOdd(5));
        System.out.println(MyInteger.isPrime(5));
        System.out.println(myInteger.equals(5));
        char[] arr = {'5'};
        System.out.println(MyInteger.parseInt(arr));
        System.out.println(MyInteger.parseInt("5"));

    }

}
