package src.main;

public class Person {
    private int userID;
    private String username;

    public Person(int userID, String username) {
        this.userID = userID;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
