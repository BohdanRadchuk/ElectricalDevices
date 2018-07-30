import com.trainings.service.DevicesSorter;
import org.junit.Assert;
import org.junit.Test;

public class IntParserTest {

    @Test
    public void simpleNumberTest() {
        Assert.assertTrue(DevicesSorter.checkForInt("5"));
    }

    @Test
    public void zeroTest() {
        Assert.assertTrue(DevicesSorter.checkForInt("0"));
    }

    @Test
    public void negativeNumberTest() {
        Assert.assertTrue(DevicesSorter.checkForInt("-1"));
    }

    @Test
    public void nullTest() {
        String nullString = null;
        Assert.assertFalse(DevicesSorter.checkForInt(nullString));
    }

    @Test
    public void charTest() {
        Assert.assertFalse(DevicesSorter.checkForInt("a"));
    }

    @Test
    public void symbolsTest(){
        Assert.assertFalse(DevicesSorter.checkForInt("$"));
    }
}
