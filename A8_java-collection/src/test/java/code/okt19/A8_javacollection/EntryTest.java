package code.okt19.A8_javacollection;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryTest {

    @Test
    void testMap() {

        Map<String,String> map = new HashMap<>();

        map.put("first","Dias");
        map.put("middle","Nur");
        map.put("last","Ramadhan");

        Set<String> strings = map.keySet();
        System.out.println(strings);

        Set<Map.Entry<String, String>> entries = map.entrySet();

    }
}
