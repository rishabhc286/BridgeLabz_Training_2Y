import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input in feet
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        // Convert to yards and miles
        double yards = feet / 3;
        double miles = feet / 5280;

        // Print result
        System.out.println("The distance of " + feet + " feet is equal to "
                + yards + " yards and " + miles + " miles.");
    }
}
