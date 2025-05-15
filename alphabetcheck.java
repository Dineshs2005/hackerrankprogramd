import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char c = Character.toLowerCase(ch);

        if (!Character.isAlphabetic(c)) {
            System.out.println("Not an alphabet");
        } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

        sc.close();
    }
}
