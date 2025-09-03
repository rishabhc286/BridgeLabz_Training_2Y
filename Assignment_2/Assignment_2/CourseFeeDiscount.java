public class CourseFeeDiscount {
    public static void main(String[] args) {
        double courseFee = 125000;
        double discountPercent = 10;

        double discountAmount = (discountPercent / 100) * courseFee;
        double discountedPrice = courseFee - discountAmount;

        System.out.println("Discount Amount: INR " + discountAmount);
        System.out.println("Discounted Price to Pay: INR " + discountedPrice);
    }
}
