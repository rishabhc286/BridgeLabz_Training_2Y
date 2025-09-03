import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;  // Assume number is prime by default

        // Prime numbers are greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to num-1
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {   // Divisible => not prime
                    isPrime = false;
                    break;  // Exit loop early
                }
            }
        }

        // Print result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();
    }
}
