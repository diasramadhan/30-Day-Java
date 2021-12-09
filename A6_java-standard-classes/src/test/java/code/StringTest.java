package code;

import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    void testMethodString() {
        String name = "Dias Nur Ramadhan";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("D"));
        System.out.println(name.endsWith("n"));

        String[] splitName = name.split(" ");
        for (var value : splitName) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println("".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] charArrayName = name.toCharArray();
    }
}
