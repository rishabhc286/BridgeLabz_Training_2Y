import java.util.Scanner;

public class KmToMile {
    public static void main(String[] args) {
        double km, miles;

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input in kilometers
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Convert km to miles
        miles = km / 1.6;

        // Show output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}