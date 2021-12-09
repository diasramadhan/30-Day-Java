package code;

import org.junit.jupiter.api.Test;

import java.util.StringJoiner;

public class StringJoinerClassTest {
    @Test
    void testStringJoiner() {
        String[] names = new String[]{
                "Dias","Nur","Ramadhan"
        };

        StringJoiner joiner = new StringJoiner(",","[","]");
        for (var name : names) {
            joiner.add(name);
        }
        System.out.println(joiner);

        String toStringJoiner = joiner.toString();

        System.out.println(toStringJoiner);
    }
}
