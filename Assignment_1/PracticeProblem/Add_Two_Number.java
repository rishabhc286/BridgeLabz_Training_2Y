import java.util.Scanner;

public class Add_Two_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Digit: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second Digit: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.print("The Sum Is: ");
        System.out.print(sum);
    }
}