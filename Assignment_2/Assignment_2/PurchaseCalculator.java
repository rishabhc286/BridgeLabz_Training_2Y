import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for unit price
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = input.nextDouble();

        // Take input for quantity
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Print output
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);
    }
}
