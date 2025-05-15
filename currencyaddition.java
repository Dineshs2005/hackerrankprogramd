import java.util.Scanner;

public class CurrencyAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dollar1 = sc.nextInt();
        int cent1 = sc.nextInt();
        int dollar2 = sc.nextInt();
        int cent2 = sc.nextInt();
        int totalCents = cent1 + cent2;
        int carryDollars = totalCents / 100;
        int finalCents = totalCents % 100;
        int finalDollars = dollar1 + dollar2 + carryDollars;
        System.out.println(finalDollars);
        System.out.println(finalCents);
    }
}
