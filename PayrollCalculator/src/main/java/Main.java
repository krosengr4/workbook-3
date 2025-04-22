public class Main {

    public static void main(String[] args) {
        Employee p1 = new Employee(10, "Kevin", 8, 110);

        double grossPay;

        grossPay = p1.calculateGrossPay();

        System.out.println(grossPay);
    }

}
