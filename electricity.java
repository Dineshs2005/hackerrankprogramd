import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();

        double bill = 0.0;

        if (units <= 200) {
            bill = units * 0.5;
        } else if (units <= 400) {
            bill = (units * 0.65) + 100;
        } else if (units <= 600) {
            bill = (units * 0.80) + 200;
        } else {
            bill = (units * 1.25) + 425;
        }
        int finalBill = (int)Math.floor(bill);

        System.out.println("Rs." + finalBill);

        sc.close();
    }
}
