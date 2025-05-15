import java.util.Scanner;

public class ShirtPriceComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fkPrice = sc.nextInt();
        int fkDiscount = sc.nextInt();
        int fkShipping = sc.nextInt();
        int sdPrice = sc.nextInt();
        int sdDiscount = sc.nextInt();
        int sdShipping = sc.nextInt();

        int amPrice = sc.nextInt();
        int amDiscount = sc.nextInt();
        int amShipping = sc.nextInt();
        int finalFkPrice = (int) Math.round(fkPrice - (fkPrice * fkDiscount / 100.0)) + fkShipping;
        int finalSdPrice = (int) Math.round(sdPrice - (sdPrice * sdDiscount / 100.0)) + sdShipping;
        int finalAmPrice = (int) Math.round(amPrice - (amPrice * amDiscount / 100.0)) + amShipping;

        System.out.println("In Flipkart: Rs." + finalFkPrice);
        System.out.println("In Snapdeal: Rs." + finalSdPrice);
        System.out.println("In Amazon: Rs." + finalAmPrice;
        if (finalFkPrice <= finalSdPrice && finalFkPrice <= finalAmPrice) {
            System.out.println("Choose Flipkart");
        } else if (finalSdPrice <= finalFkPrice && finalSdPrice <= finalAmPrice) {
            System.out.println("Choose Snapdeal");
        } else {
            System.out.println("Choose Amazon");
        }

        sc.close();
    }
}
