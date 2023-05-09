import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VIPTest {

    @Test
    public void testBronzePlayer() {
        Player bronzePlayer = new BronzePlayer("Bronze Player", 100.0);
        assertEquals(1, bronzePlayer.getVIPLevel());
        assertEquals(100.0, bronzePlayer.getCash());
        bronzePlayer.increaseCash(50.0);
        assertEquals(150.0, bronzePlayer.getCash());
    }

    @Test
    public void testSilverPlayer() {
        Player silverPlayer = new SilverPlayer("Silver Player", 100.0);
        assertEquals(2, silverPlayer.getVIPLevel());
        assertEquals(100.0, silverPlayer.getCash());
        silverPlayer.increaseCash(50.0);
        assertEquals(175.0, silverPlayer.getCash());
    }

    @Test
    public void testGoldPlayer() {
        Player goldPlayer = new GoldPlayer("Gold Player", 100.0);
        assertEquals(3, goldPlayer.getVIPLevel());
        assertEquals(100.0, goldPlayer.getCash());
        goldPlayer.increaseCash(50.0);
        assertEquals(200.0, goldPlayer.getCash());
    }
}