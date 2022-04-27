public class Player {
    private int id;
    private String username;
    private int discordId;

    public Player(int id, String username, int discordId) {
        this.id = id;
        this.username = username;
        this.discordId = discordId;
    }

    public String getUsername() {
        return username;
    }

    public int getDiscordId() {
        return discordId;
    }
}
