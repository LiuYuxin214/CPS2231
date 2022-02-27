package Assignment1;

//Purpose: Convert from Cº to Fº and Fº to Cº and list a conversion table
//Main idea: fahrenheit = celsius*9/5+32 celsius = (fahrenheit-32)*5/9
public class ConversionTwice {

    public static void main(String[] args) {
        //1.Show the title
        System.out.print("Celsius       Fahrenheit");
        System.out.print("  |  ");
        System.out.println("Fahrenheit       Celsius");
        //2.Display the table1
        double fahrenheit = 0.0;
        int fahrenheit2 = 20;
        double celsius2 = 0.0;
        for (int celsius = 0; celsius <= 100; celsius += 2) {
            System.out.print(celsius);
            System.out.print("              ");
            if (celsius >= 0 && celsius <= 8) System.out.print("   ");
            if (celsius >= 10 && celsius <= 36) System.out.print("  ");
            if (celsius >= 38 && celsius <= 98) System.out.print(" ");
            fahrenheit = (double) celsius * 9.0 / 5.0 + 32.0;
            System.out.printf("%.3f", fahrenheit);
            //3.Display the table2
            System.out.print("  |  ");
            System.out.print(fahrenheit2);
            if (celsius >= 0 && celsius <= 4) System.out.print("                ");
            if (celsius >= 6 && celsius <= 10) System.out.print("                 ");
            if (celsius >= 12 && celsius <= 30) System.out.print("                ");
            if (celsius >= 32 && celsius <= 76) System.out.print("               ");
            if (celsius >= 78 && celsius <= 100) System.out.print("              ");
            celsius2 = (fahrenheit2 - 32) * 5 / 9;
            System.out.printf("%.3f\n", celsius2);
            fahrenheit2 += 5;
        }
    }

}
