import java.util.Scanner;

public class DoorCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int firstDigit = number / 1000;
        int lastDigit = number % 10;
        
        int result = firstDigit + lastDigit;

        System.out.println(result);

        sc.close();
    }
}
