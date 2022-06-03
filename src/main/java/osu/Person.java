package osu;

public abstract class Person {
    private int id;
    private String username;
    private int discordId;

    public Person(int id, String username, int discordId) {
        this.id = id;
        this.username = username;
        this.discordId = discordId;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getDiscordId() {
        return discordId;
    }
}
