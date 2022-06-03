import java.io.IOException;

import config.Config;
import discord.Bot;

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

        Bot.main();
//        osu.Round finals = new osu.Round("Finals", 2, 13);
//        finals.addMap(new osu.Map(1, "NM", 1));
//        osu.Player stan = new osu.Player(1, "Stan", 1);
//        osu.Player nick = new osu.Player(2, "Nick", 2);
//        osu.Match match = new osu.Match(1, finals, "", stan, nick);
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