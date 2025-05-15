import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int year = sc.nextInt();
        int income = sc.nextInt();
        int arrears = sc.nextInt();
        float marks = sc.nextFloat();
        float attendance = sc.nextFloat();
        sc.close();

        boolean basicCriteria = (age >= 18 && age < 21) &&
                                (year >= 2021) &&
                                (arrears <= 2) &&
                                (income <= 200000) &&
                                (marks >= 60) &&
                                (attendance >= 80);

        boolean relaxCriteria = (arrears > 2) &&
                                (marks >= 80) &&
                                (attendance >= 90) &&
                                (age >= 18 && age < 21) &&
                                (year >= 2021) &&
                                (income <= 200000);

        boolean partialCriteria = (income >= 200000 && income < 250000) &&
                                  (arrears <= 2) &&
                                  (marks >= 60) &&
                                  (attendance >= 80) &&
                                  (age >= 18 && age < 21) &&
                                  (year >= 2021);

        if (basicCriteria || relaxCriteria) {
            System.out.println("Eligible");
        } else if (partialCriteria) {
            System.out.println("Partially Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
