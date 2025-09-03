import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum
        int sum = 0;
        int originalNumber = number;

        // Step 3: Use while loop to calculate sum of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;  // Get last digit
            sum += digit;                     // Add digit to sum
            originalNumber = originalNumber / 10; // Remove last digit
        }

        // Step 4: Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
