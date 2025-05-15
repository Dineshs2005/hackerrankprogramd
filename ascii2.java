import java.util.Scanner;

public class AsciiToChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ascii = sc.nextInt();
        char ch = (char) ascii;
        System.out.println(ch);

        sc.close();
    }
}
