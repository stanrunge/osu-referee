package com.stanrunge.opt3;

import com.stanrunge.opt3.entities.Map;
import com.stanrunge.opt3.entities.User;

import java.util.Random;
import java.util.Scanner;

public class RefereeLogic {
    static Map[] mappool = new Map[3];
    int pointsPlayer1 = 0;
    int pointsPlayer2 = 0;

    User rollWinner(User player1, User player2) {
        Random random = new Random();
        int randomInt = random.nextInt(2);
        if (randomInt == 0) {
            return player1;
        } else {
            return player2;
        }
    }

    static int roll() {
        Random random = new Random();
        return random.nextInt(101);
    }

    static String choosePickOrBan() {
        System.out.println("PICK or BAN?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("pick")) {
            return "pick";
        } else if (input.equals("ban")) {
            return "ban";
        } else {
            System.out.println("Invalid input");
            return choosePickOrBan();
        }
    }

    static void askForBans(User player) {
        System.out.println(player.getUsername() + " please select a ban:");
        listMaps(mappool);
    }

    static void listMaps(Map[] mappool) {
        System.out.println("List of maps:");
        for (Map map : mappool) {
            System.out.println(map.getName());
        }
    }

    static void playerWin(User player) {
        System.out.println(player.getUsername() + " wins!");
    }

    static void postToDiscord() {
        System.out.println("Posting to Discord...");
        // TODO: Post to Discord
    }

    static void postToChallonge() {
        System.out.println("Posting to Challonge...");
        // TODO: Post to Challonge
    }

    static void endMatch() {
        System.out.println("Ending match...");
        // TODO: End match
    }

    static void checkForWinner() {

    }
}
