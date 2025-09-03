import java.util.Scanner;

public class Area_of_a_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double Area = 3.14*radius*radius;
        System.out.print(Area);
    }
}
