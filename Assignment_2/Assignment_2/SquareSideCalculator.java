import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Print result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
