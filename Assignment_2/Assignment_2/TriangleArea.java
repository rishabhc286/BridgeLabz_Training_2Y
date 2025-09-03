import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs for base and height in inches
        System.out.print("Enter the base of the triangle in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double height = input.nextDouble();

        // Calculate area in square inches
        double areaInches = 0.5 * base * height;

        // Convert to square centimeters
        double areaCm = areaInches * 6.4516;

        // Print output
        System.out.println("The area of the triangle is " + areaInches + " square inches"
                + " and " + areaCm + " square centimeters.");
    }
}
