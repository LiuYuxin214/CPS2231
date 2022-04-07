package LabExercise10;

public class MyString1 {
    char[] str;

    public MyString1(char[] chars) {
        str = new char[chars.length];
        int i = 0;
        for (char c : chars) {
            this.str[i] = c;
            i++;
        }

    }

    public char charAt(int index) {
        return str[index];
    }

    public int length() {
        return str.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] sub = new char[end - begin];
        int j = 0;
        for (int i = begin; i < end; i++) {
            sub[j] = str[i];
            j++;
        }
        return new MyString1(sub);
    }

    public MyString1 toLowerCase() {
        char[] lower = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'Z') {
                lower[i] = (char) (str[i] + 32);
            } else {
                lower[i] = str[i];
            }
        }
        return new MyString1(lower);
    }

    public boolean equals(MyString1 s) {
        if (s.length() != this.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != this.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        String s = i + "";
        char[] value = s.toCharArray();
        return new MyString1(value);
    }

    public static void main(String[] args) {
        char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        MyString1 s = new MyString1(c);
        MyString1 lower = s.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            System.out.print(lower.charAt(i));
        }
        System.out.println();
        MyString1 sub = s.substring(0, 3);
        for (int i = 0; i < sub.length(); i++) {
            System.out.print(sub.charAt(i));
        }
        System.out.println();
        System.out.println(s.length());
        System.out.println(s.equals(lower));

    }
}
