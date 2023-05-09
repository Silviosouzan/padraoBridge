public class GoldPlayer extends Player {
    public GoldPlayer(String playerName, double cash) {
        super(new GoldVIPImpl(), playerName, cash);
    }
}