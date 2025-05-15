import java.util.Scanner;
import java.lang.Math;

public class FloatRounding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println((int) num);
        System.out.println((int) Math.ceil(num));
        System.out.println((int) Math.floor(num));

        sc.close();
    }
}
