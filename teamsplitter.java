import java.util.Scanner;

public class TeamSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalFriends = sc.nextInt();
        int numberOfTeams = sc.nextInt();

        int friendsPerTeam = totalFriends / numberOfTeams;
        int leftOut = totalFriends % numberOfTeams;

        System.out.println("The number of friends in each team is " + friendsPerTeam + " and left out is " + leftOut);

        sc.close();
    }
}
