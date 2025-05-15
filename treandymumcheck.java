import java.util.Scanner;

public class TrendyNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n < 100 || n > 999) {
            System.out.println("Invalid Number");
            return;
        }
        int middleDigit = (n / 10) % 10;
        if (middleDigit % 3 == 0) {
            System.out.println("Trendy Number");
        } else {
            System.out.println("Not a Trendy Number");
        }
    }
}
