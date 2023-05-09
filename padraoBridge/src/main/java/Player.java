public abstract class Player {
    private VIPAPI vipImpl;
    private String playerName;
    private double cash;

    public Player(VIPAPI vipImpl, String playerName, double cash) {
        this.vipImpl = vipImpl;
        this.playerName = playerName;
        this.cash = cash;
    }

    public void increaseCash(double amount) {
        cash += amount * vipImpl.getVIPMultiplier();
    }

    public double getCash() {
        return cash;
    }

    public int getVIPLevel() {
        return vipImpl.getVIPLevel();
    }
}
