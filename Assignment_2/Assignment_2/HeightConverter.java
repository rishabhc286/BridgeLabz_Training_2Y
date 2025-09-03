import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for height in cm
        System.out.print("Enter your height in centimeters: ");
        double cm = input.nextDouble();

        // Convert cm to total inches
        double totalInches = cm / 2.54;

        // Find feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Print output
        System.out.println("Your Height in cm is " + cm +
                " while in feet is " + feet +
                " and inches is " + String.format("%.2f", inches));
    }
}
