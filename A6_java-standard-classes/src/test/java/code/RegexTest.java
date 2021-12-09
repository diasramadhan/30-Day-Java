package code;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    @Test
    void testPatternMacher() {
        String name = "Dias Nur Ramadhan Code Okt 19";
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
