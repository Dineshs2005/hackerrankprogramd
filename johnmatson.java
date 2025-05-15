import java.util.Scanner;

public class JohnWatsonSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] hours = new int[7];
        for (int i = 0; i < 7; i++) {
            hours[i] = sc.nextInt();
        }
        sc.close();
        
        int totalSalary = 0;
        
        for (int i = 0; i < 7; i++) {
            int dayHours = hours[i];
            int basePay = dayHours * 100;
            int extraPay = 0;
            if (dayHours > 8) {
                extraPay = (dayHours - 8) * 15;
            }
            
            int daySalary = basePay + extraPay;
            if (i == 0) { // Sunday: 50% bonus
                daySalary += (daySalary * 50) / 100;
            } else if (i == 6) { // Saturday: 25% bonus
                daySalary += (daySalary * 25) / 100;
            }
            
            totalSalary += daySalary;
        }
        
        System.out.println(totalSalary);
    }
}
