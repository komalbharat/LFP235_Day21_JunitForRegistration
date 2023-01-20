package JUnitForRegistration;
import org.junit.Assert;
import org.junit.Test;
import java.util.regex.Pattern;

public class TestReg extends Registration {
    @Test
    public void NameTest(){
        Assert.assertEquals(true, Name("Ankit") );
    }

    @Test
    public void LastNameTest(){
        Assert.assertEquals(true, Last("Kumar") );
    }
    @Test
    public void EmailTest(){
        Assert.assertEquals(true, Email("Kankit40@gmail.com") );
    }
    @Test
    public void PhoneTest(){
        Assert.assertEquals(true, Phone("91 9898989898") );
    }
    @Test
    public void PasswordTest(){
        Assert.assertEquals(true, Password("01@abcdefgh") );
    }

}
