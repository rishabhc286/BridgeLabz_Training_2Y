import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Step 2: Convert height from cm to meters
        double heightM = heightCm / 100.0;

        // Step 3: Calculate BMI using formula
        double bmi = weight / (heightM * heightM);

        // Step 4: Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Step 5: Display result
        System.out.printf("\n--- BMI Result ---\n");
        System.out.printf("Weight: %.2f kg\n", weight);
        System.out.printf("Height: %.2f m\n", heightM);
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Status: " + status);

        sc.close();
    }
}
