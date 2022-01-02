package code.okt19.A8_javacollection;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class MapInterface {

    @Test
    void testMap() {

        Map<String,String> names = new HashMap<>();
        names.put("firstName","Dias");
        names.put("middleName","Nur");
        names.put("lastName","Ramadhan");

        names.forEach((s, s2) -> System.out.println("Key :"+ s + ",  Value :" + s2 ));
    }

    @Test
    void testWeakHashMapp() {

        Map<Integer,Integer> integerMap = new WeakHashMap<>();
        for (int i = 0; i < 1_000_000; i++) {
            integerMap.put(i,i);
        }

//        System.gc();

        System.out.println(integerMap.size());
    }

    @Test
    void testIdentityHashMap() {

    }

    @Test
    void testLinkedHashMap() {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("first","Dias");
        map.put("middle","Nur");
        map.put("last","Ramadhan");

        for (var value : map.keySet()){
            System.out.println(value);
        }

        for (var value : map.values()){
            System.out.println(value);
        }
    }


}
