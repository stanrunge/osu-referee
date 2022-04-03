package src.main;

public class Map {
    private int mapID;
    private Round round;
    private ModNum modnum;

    public Map(Round round, ModNum modnum, int mapID) {
        this.round = round;
        this.modnum = modnum;
        this.mapID = mapID;
    }
}
