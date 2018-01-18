
import by.lyubin.flower.logick.BotanicEncyclopedia;
import by.lyubin.flower.logick.FortuneTeller;
import org.junit.Test;

public class TellerTest {
    private FortuneTeller fortuneTeller = new FortuneTeller();
    private BotanicEncyclopedia botanicEncyclopedia = new BotanicEncyclopedia();


    @Test
    public void testTeller() throws Exception {
        fortuneTeller.teller();
    }


}
