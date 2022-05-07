import java.io.IOException;
import java.net.http.HttpResponse;
import java.sql.*;
import java.util.Scanner;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.json.*;

import javax.security.auth.login.LoginException;

public class Main {
//    File jsonFile = new File("config.json");
//    Scanner scanner = new Scanner(System.in);
//
//    static void getConfig() {
//
//    }

    static Config config = new Config();

    public static void main(String[] args) throws IOException, LoginException {
        System.out.println("Starting osu! referee bot\n");



        DiscordBot.main();
//        Round finals = new Round("Finals", 2, 13);
//        finals.addMap(new Map(1, "NM", 1));
//        Player stan = new Player(1, "Stan", 1);
//        Player nick = new Player(2, "Nick", 2);
//        Match match = new Match(1, finals, "", stan, nick);
//
//        match.play();
    }

//    static String connectToDatabase(String query) {
//        try {
//            Connection con = DriverManager.getConnection(DB-SERVER, USER, PASSWORD);
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//
//            if(rs.next()) {
//                return rs.getString(1);
//            }
//
//            return "null";
//        } catch (Exception e) {
//            return e.toString();
//        }
//    }
//
//    static void connectToChallonge() {
//        String url = "https://api.challonge.com/v2/";
//        String apiKey = "gfnuIHVlH3A2qmDUcZu71E7pCbBKcWUihgwVDU1W"; //leaked v1 api key suck my ballssssss
//
//        HttpResponse <String> httpResponse = Unirest.get();
//    }
}