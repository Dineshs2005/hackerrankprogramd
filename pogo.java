import java.util.Scanner;

public class PogoStickHops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int startX = 3;
        int startY = 4;

        int dx = Math.abs(x - startX);
        int dy = Math.abs(y - startY);

        int hops = Math.max(dx, dy);  

        System.out.println(hops);

        sc.close();
    }
}
