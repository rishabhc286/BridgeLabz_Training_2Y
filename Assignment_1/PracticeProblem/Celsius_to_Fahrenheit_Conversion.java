import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;

public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Celcius:");
        double celsius = input.nextDouble();

        double Fahrenheit = (celsius*9/5) +32;
        System.out.print("Temperature in Fahrenheit:");
        System.out.print(Fahrenheit);
    }
}