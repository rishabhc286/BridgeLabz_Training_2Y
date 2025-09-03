import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize count variable
        int count = 0;

        // Special case: if number is 0, it has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Step 3: Loop until number becomes 0
            while (number != 0) {
                number = number / 10;  // Remove last digit
                count++;               // Increase digit count
            }
        }

        // Step 4: Display result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}