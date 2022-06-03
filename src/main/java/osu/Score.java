package osu;

public class Score {
    private int id;
    private Map map;
    private Player player;
    private int score;

    public Score(int id, Map map, Player player, int score) {
        this.id = id;
        this.map = map;
        this.player = player;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public Map getMap() {
        return map;
    }

    public Player getPlayer() {
        return player;
    }

    public int getScore() {
        return score;
    }
}
