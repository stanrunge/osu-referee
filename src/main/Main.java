package src.main;

import java.io.IOException;
import java.net.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Main {
    static String server = "irc.ppy.sh";
    static int port = 6667;
    String nickname = "stan";
    String channel = "#bot-test-ch";
    String message = "hi, all";

    public static void main(String[] args) throws IOException {
        System.out.println("Starting osu! referee bot\n");

        connectToOsu();

//        Round Ro32 = new Round("Round of 32", 7);
//        ModNum NM1 = new ModNum("No Mod", 1);
//        Map Ro32NM1 = new Map(Ro32, NM1, 131891);
//        Ro32.addMap(Ro32NM1);
//
//        Player stan = new Player(1, "Stan");
//        Player nick = new Player(2, "Nick");
//
//        Match match1 = new Match(1, Ro32, new GregorianCalendar(2022, Calendar.APRIL, 7), stan, nick);
//
//        match1.play();
    }

    static void connectToOsu() throws IOException {
        Socket socket = new Socket(server, port);
        System.out.println("Connected to osu!");
    }
}