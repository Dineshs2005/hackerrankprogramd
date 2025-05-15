import java.util.Scanner;
public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        float cgpaInput = sc.nextFloat();
        char grade = sc.next().charAt(0);
        float cgpaTruncated = (int)(cgpaInput * 100) / 100.0f;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("CGPA: %.2f\n", cgpaTruncated);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
