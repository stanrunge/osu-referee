package src.main;

import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class Match {
    Scanner scanner = new Scanner(System.in);

    private int ID;
    private Round round;
    private Player player1;
    private Player player2;
    private GregorianCalendar time;

    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;

    private Player rollWinner;
    private boolean ended = false;
    private Player winner;

    public Match(int ID, Round round, GregorianCalendar time, Player player1, Player player2) {
        this.ID = ID;
        this.round = round;
        this.time = time;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.printf("Match %d (%s) has started.%n%n", ID, round.getName());

        System.out.println("Now rolling...");
        roll(player1, player2);

        while(!ended) {
            playMap(round.getMap(new ModNum("No Mod", 1)));
            if (scorePlayer1 * 2 > round.getBestOf()) {
                ended = true;
                winner = player1;
            } else if (scorePlayer2 * 2 > round.getBestOf()) {
                ended = true;
                winner = player2;
            }
        }

        System.out.printf("Match ended! Winner: %s", winner.getUsername());
    }

    void roll(Player player1, Player player2) {
        Random random = new Random();
        int roll1 = random.nextInt(1,101);
        int roll2 = random.nextInt(1,101);

        System.out.println(player1.getUsername() + " rolled: " + roll1);
        System.out.println(player2.getUsername() + " rolled: " + roll2);
        System.out.println();

        if (roll1 > roll2) {
            System.out.println(player1.getUsername() + " has won the roll!");
            rollWinner = player1;
        } else if (roll1 < roll2) {
            System.out.println(player2.getUsername() + " has won the roll!");
            rollWinner = player2;
        } else {
            System.out.println("Tie! Re-rolling...");
            roll(player1, player2);
        }
    }

    void playMap(Map map) {
        System.out.println();
        System.out.printf("Playing map: %d%n", map.getMapID());

        System.out.print("Enter player 1 points: ");
        int pointsPlayer1 = scanner.nextInt();
        System.out.print("Enter player 2 points: ");
        int pointsPlayer2 = scanner.nextInt();

        if (pointsPlayer1 > pointsPlayer2) {
            scorePlayer1++;
            System.out.println("Player ");
        } else if (pointsPlayer1 < pointsPlayer2) {
            scorePlayer2++;
        } else {
            System.out.println("Tie! Replaying the map");
            playMap(map);
        }
    }

    void printScore(Player player1, Player player2) {
        System.out.println("Score " + player1.getUsername() + ": " + scorePlayer1);
        System.out.println("Score " + player2.getUsername() + ": " + scorePlayer2);
    }
}
