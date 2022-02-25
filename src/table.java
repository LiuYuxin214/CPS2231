import java.util.*;

//Purpose:
//Main idea: 
public class table {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
            for(int i=1;i<4;i++){
                for(int j=1;j<4;j++){
                    if(i*j>2)
                        continue;
                    System.out.println(i*j);
                }
                System.out.println(a);
            }
        }
}

