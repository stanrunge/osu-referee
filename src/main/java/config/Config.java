package config;

public class Config {
    private static String discordToken = "NTk3Mjc5NTQ5OTUyMzYwNDc4.XSFx7Q.5E2zz4U4_sj1G2BsRas-10OIqkk";
    private static String ircPassword;
    private static String challongeUsername = "stan_osu";
    private static String challongeToken = "gfnuIHVlH3A2qmDUcZu71E7pCbBKcWUihgwVDU1W";

    public static String getDiscordToken() {
        return discordToken;
    }

    public static String getChallongeToken() {
        return challongeToken;
    }

    public static String getIrcPassword() {
        return ircPassword;
    }

    public static String getChallongeUsername() {
        return challongeUsername;
    }
}
