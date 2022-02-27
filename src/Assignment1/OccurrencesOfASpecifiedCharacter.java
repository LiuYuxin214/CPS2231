package Assignment1;

import java.util.*;

//Purpose:
//Main idea:
public class OccurrencesOfASpecifiedCharacter {
    public static int count(String str, char a){
        int result=0;
        str.indexOf(a);
        return result;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String source = input.next();
        String in = input.next();
        char target = in.charAt(0);
        System.out.println(""+count(source,target));
    }

}
