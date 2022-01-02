package code.okt19.A8_javacollection;

import org.junit.jupiter.api.Test;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {
    @Test
    void testSortedMap() {
        SortedMap<String,String> map = new TreeMap<>();

        map.put("first","Dias");
        map.put("middle","Nur");
        map.put("last","Ramadhan");

        map.forEach((s, s2) -> System.out.println("Key : " + s + ", Value : "+ s2));
    }
}
