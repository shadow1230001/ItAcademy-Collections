import by.lyubin.flower.logick.FortuneTeller;
import org.junit.Test;

public class TellerTest {
    private FortuneTeller fortuneTeller = new FortuneTeller();


    @Test
    public void testTeller() throws Exception {
        fortuneTeller.teller();
    }

}
