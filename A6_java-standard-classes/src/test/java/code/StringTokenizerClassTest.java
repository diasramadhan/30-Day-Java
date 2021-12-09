package code;

import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;

public class StringTokenizerClassTest {
    @Test
    void testStringTokenizerTest() {
        String name = "Dias Nur Ramadhan";
        StringTokenizer stringTokenizer = new StringTokenizer(name," ");

        while (stringTokenizer.hasMoreTokens()){
            String result = stringTokenizer.nextToken();
            System.out.println(result);
        }
    }
}
