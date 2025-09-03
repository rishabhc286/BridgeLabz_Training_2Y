import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for fee
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        // Take user input for discount percent
        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount and final fee
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        // Print results
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}
