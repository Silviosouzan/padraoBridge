public class BronzePlayer extends Player {
    public BronzePlayer(String playerName, double cash) {
        super(new BronzeVIPImpl(), playerName, cash);
    }
}