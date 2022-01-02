package code.okt19.A8_javacollection;

import org.junit.jupiter.api.Test;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class LegacyCollection {

    @Test
    void testVector() {
        List<String> list = new Vector<>();
        list.add("Dias");
        list.add("Nur");
        list.add("Ramadhan");

        list.forEach(s -> System.out.println(s));
    }

    @Test
    void hashTable() {
        Map<String,String> map = new Hashtable<>();
        map.put("first", "Dias");
    }
}
