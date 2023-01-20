package JUnitForRegistration;
import java.util.regex.Pattern;
import java.util.Scanner;


public class Registration {
    static boolean Name(String str1) {
        boolean b1 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str1).matches();
        return b1;
    }
    public static void main(String[] args) {
    }

    }


