import java.util.Scanner;

public class HeraldProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 

        int fixedCost = 100;

        int revenue = a * b;
        int variableCost = a * c;

        int profit = revenue - (variableCost + fixedCost);

        System.out.println(profit);

        sc.close();
    }
}
