package osu;

public class Map {
    private int id;
    private String mod;
    private int modnum;

    public Map(int id, String mod, int modnum) {
        this.id = id;
        this.mod = mod;
        this.modnum = modnum;
    }

    public int getId() {
        return id;
    }

    public String getMod() {
        return mod;
    }

    public int getModnum() {
        return modnum;
    }
}
