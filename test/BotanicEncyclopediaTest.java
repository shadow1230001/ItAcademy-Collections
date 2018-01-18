import by.lyubin.flower.bean.Flower;
import by.lyubin.flower.logick.BotanicEncyclopedia;
import org.junit.Test;

public class BotanicEncyclopediaTest {
    private BotanicEncyclopedia botanicEncyclopediaTest = new BotanicEncyclopedia();


    @Test
    public void testPrintFlowerInfo() throws NullPointerException {
        botanicEncyclopediaTest.printFlowerInfo(new Flower("",0,0));

    }


}
