package osu;

import java.util.ArrayList;

public class Round {
    private String name;
    private ArrayList<Map> mappool = new ArrayList<Map>();
    private int bans;
    private int bestOf;

    public Round(String name, int bans, int bestOf) {
        this.name = name;
        this.bans = bans;
        this.bestOf = bestOf;
    }

    public void addMap(Map map) {
        mappool.add(map);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Map> getMappool() {
        return mappool;
    }

    public int getBans() {
        return bans;
    }

    public int getBestOf() {
        return bestOf;
    }
}
