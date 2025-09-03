import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Step 3: Use while loop until originalNumber becomes 0
        while (originalNumber != 0) {
            // Step 4: Find last digit
            int digit = originalNumber % 10;

            // Step 5: Find cube of digit and add to sum
            sum += digit * digit * digit;

            // Step 6: Remove last digit (quotient)
            originalNumber = originalNumber / 10;
        }

        // Step 7: Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
