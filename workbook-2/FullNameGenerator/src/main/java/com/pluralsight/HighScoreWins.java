package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter game score as such... Home:Visitor|HomeScore:VisitorScore: ");
        String input = scanner.nextLine();

        String[] players = input.split("[:|]");

        String homeTeam = players[0];
        String visitorTeam = players[1];

        int homeScore = Integer.parseInt(players[2]);
        int visitorScore = Integer.parseInt(players[3]);

        if (homeScore > visitorScore) {
            System.out.println("Winning team: " + homeTeam);
        } else if (homeScore < visitorScore) {
            System.out.println("Winning team: " + visitorTeam);
        } else {
            System.out.print("Tie game!");
        }
    }
}
