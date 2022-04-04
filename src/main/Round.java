package src.main;

import java.util.ArrayList;

public class Round {
    private String name;
    private int bestOf;
    private ArrayList<Map> mappool = new ArrayList<Map>();

    public Round(String name, int bestOf) {
        this.name = name;
        this.bestOf = bestOf;
    }

    public int getBestOf() {
        return bestOf;
    }

    public String getName() {
        return name;
    }

    public void addMap(Map map) {
        mappool.add(map);
    }

    public Map getMap(ModNum modnum) {
        for(Map map : mappool) {
            if (map.getModnum().getID().equals(modnum.getID())) {
                return map;
            }
        }
        return null;
    }
}
