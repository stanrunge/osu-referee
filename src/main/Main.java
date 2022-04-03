package src.main;

public class Main {
    public static void main(String[] args) {
        System.out.print("Starting osu! referee bot");

        Round Ro32 = new Round("Round of 32");
        ModNum NM1 = new ModNum("No Mod", 1);
        Map Ro32NM1 = new Map(Ro32, NM1, 131891);
    }
}