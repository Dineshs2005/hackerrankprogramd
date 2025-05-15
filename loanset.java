import java.util.Scanner;

public class LoanSettlement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double years = sc.nextDouble();
        double interest = (principal * rate * years) / 100.0;
        double totalAmount = principal + interest;
        double discount = (2.0 / 100) * interest;
        double finalSettlement = totalAmount - discount;
        System.out.printf("%.2f\n", interest);
        System.out.printf("%.2f\n", totalAmount);
        System.out.printf("%.2f\n", discount);
        System.out.printf("%.2f\n", finalSettlement);

        sc.close();
    }
}
