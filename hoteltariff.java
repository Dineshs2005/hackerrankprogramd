import java.util.Scanner;

public class HotelTariff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int month = sc.nextInt();
        int rentPerDay = sc.nextInt();
        int daysStayed = sc.nextInt();
        
        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
            return;
        }
        boolean peakSeason = (month >= 4 && month <= 6) || (month == 11) || (month == 12);
        
        double tariff;
        if (peakSeason) {
            tariff = rentPerDay * 1.20 * daysStayed;  // 20% increase
        } else {
            tariff = rentPerDay * daysStayed;
        }
        System.out.println((int)tariff);
        
        sc.close();
    }
}
