import java.util.Scanner;

public class IPLMatchAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalBalls = sc.nextInt();     // e.g., 300
        int totalRuns = sc.nextInt();      // e.g., 375
        int scoredRuns = sc.nextInt();     // e.g., 78
        int ballsBowled = sc.nextInt();    // e.g., 45
        int totalOvers = totalBalls / 6;
        int oversPart = ballsBowled / 6;
        int ballsPart = ballsBowled % 6;
        String oversFinished = oversPart + "." + ballsPart;
        double currentRunRate = (double) scoredRuns * 6 / ballsBowled;
        double totalRunRate = (double) totalRuns / totalOvers;
        String eligibility = (currentRunRate > totalRunRate) ? "Eligible to Win" : "Not Eligible to Win";
        System.out.println(totalOvers);
        System.out.println(oversFinished);
        System.out.printf("%.1f\n", currentRunRate);
        System.out.printf("%.1f\n", totalRunRate);
        System.out.println(eligibility);
    }
}
