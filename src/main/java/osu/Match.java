package osu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Match {
    private final int id;
    private ArrayList<StaffMember> addrefs = new ArrayList<StaffMember>();
    private final Round round;
    private final Player playerRed;
    private final Player playerBlue;
    private String time;

    private boolean ended = false;
    private Player winner;
    private int pointsPlayerRed = 0;
    private int pointsPlayerBlue = 0;

    public Match(int id, Round round, String time, Player playerRed, Player playerBlue) {
        this.id = id;
        this.round = round;
        this.time = time;
        this.playerRed = playerRed;
        this.playerBlue = playerBlue;
    }

    public void play() {
        System.out.printf("osu.Match %d (%s) has started.%n%n", id, round.getName());

        System.out.println("Now rolling...");
        roll();

        while(!ended) {
            Map currentMap =  askForMap();
            if (currentMap == null) {
                System.out.println("osu.Map not found. Try again.\n");
                continue;
            }

            playMap(currentMap);

            printScore();

            if (pointsPlayerRed * 2 > round.getBestOf()) {
                ended = true;
                winner = playerRed;
            } else if (pointsPlayerBlue * 2 > round.getBestOf()) {
                ended = true;
                winner = playerBlue;
            }
        }

        System.out.printf("osu.Match ended! Winner: %s", winner.getUsername());
    }

    ArrayList<StaffMember> getAddrefs() {
        return addrefs;
    }

    void roll() {
        Random random = new Random();
        int roll1 = random.nextInt(1,101);
        int roll2 = random.nextInt(1,101);

        System.out.println(playerRed.getUsername() + " rolled: " + roll1);
        System.out.println(playerBlue.getUsername() + " rolled: " + roll2);
        System.out.println();

        if (roll1 > roll2) {
            System.out.println(playerRed.getUsername() + " has won the roll!");
        } else if (roll1 < roll2) {
            System.out.println(playerBlue.getUsername() + " has won the roll!");
        } else {
            System.out.println("Tie! Re-rolling...");
            roll();
        }
    }

    void printScore() {
        System.out.println();
        System.out.println("Points " + playerRed.getUsername() + ": " + pointsPlayerRed);
        System.out.println("Points " + playerBlue.getUsername() + ": " + pointsPlayerBlue);
        System.out.println();
    }

    Map askForMap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the map you want to play (");
        for (Map map : round.getMappool()) {
            System.out.print(map.getMod() + map.getModnum() + ", ");
        }
        System.out.print("): ");

        String mapID = scanner.nextLine();

        for(Map map : round.getMappool()) {
            if (mapID.equals(map.getMod() + map.getModnum())) {
                return map;
            }
        }
        return null;
    }

    void playMap(Map map) {
        pointsPlayerRed++;
    }
}
