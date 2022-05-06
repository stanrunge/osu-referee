import java.io.IOException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting osu! referee bot\n");

        Integer testInt = 5;


        Round finals = new Round("Finals", 2, 13);
        finals.addMap(new Map(1, "NM", 1));
        Player stan = new Player(1, "Stan", 1);
        Player nick = new Player(2, "Nick", 2);
        Match match = new Match(1, finals, "", stan, nick);

        match.play();
    }

    static String connectToDatabase(String query) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://82.170.172.195/ces-gaming", "stan", "Daisyenbobby12!");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if(rs.next()) {
                return rs.getString(1);
            }

            return "null";
        } catch (Exception e) {
            return e.toString();
        }
    }
}