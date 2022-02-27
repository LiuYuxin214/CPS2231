package Assignment1;
//Purpose: Conversion from Cº to Fº and list a conversion table
//Main idea: fahrenheit = celsius * 9/5 + 32
public class ConversionFromCelsiusToFarenheit {

    public static void main(String[] args) {
        //1.Show the title
        System.out.println("Celsius       Fahrenheit");
        //2.Display the table
        double fahrenheit = 0.0;
        for (int celsius = 0; celsius <= 100; celsius += 2) {
            System.out.print(celsius);
            System.out.print("                ");
            if (celsius >= 0 && celsius <= 98) System.out.print(" ");
            if (celsius >= 0 && celsius <= 36) System.out.print(" ");
            if (celsius >= 0 && celsius <= 8) System.out.print(" ");
            fahrenheit = (double) celsius * 9.0 / 5.0 + 32.0;
            System.out.println(fahrenheit);
        }
    }

}

