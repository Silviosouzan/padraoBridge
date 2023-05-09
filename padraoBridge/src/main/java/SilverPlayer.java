public class SilverPlayer extends Player {
    public SilverPlayer(String playerName, double cash) {
        super(new SilverVIPImpl(), playerName, cash);
    }
}