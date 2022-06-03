package osu;

public class StaffMember extends Person {
    private int osuId;

    public StaffMember(int id, String username, int discordId, int osuId) {
        super(id, username, discordId);
        this.osuId = osuId;
    }

    public int getOsuId() {
        return osuId;
    }

    @Override
    public String getUsername() {
        return "(STAFF) " + this.getUsername();
    }
}
