package JUnitForRegistration;
import org.junit.Assert;
import org.junit.Test;
import java.util.regex.Pattern;

public class TestReg extends Registration {
    @Test
    public void RegTest (){
        Assert.assertEquals(true, Name("Avi"));
        Assert.assertEquals(true,LastName("Gharmode"));

    }

}
