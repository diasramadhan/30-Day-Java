package code.okt19.A8_javacollection;

import org.junit.jupiter.api.Test;

import java.util.*;

public class CollectionTest {

    @Test
    void testHelloWorld() {
        System.out.println("Hello World");
    }

    @Test
    void testIterable() {

        Iterable<String> stringIterable1 = List.of("Dias","Nur","Ramadhan");
        stringIterable1.forEach(s -> {
            System.out.println(s);
        });

        System.out.println("==== ITERATOR ====");
        Iterator<String> stringIterator = stringIterable1.iterator();

        while(stringIterator.hasNext()){ //menyanyakan apakah masih ada element selanjutnya
            String name = stringIterator.next(); //ambil element
            System.out.println(
                    name
            );
        }
    }


    @Test
    void testCollection() {

        Collection<String> collection = new ArrayList<>();

        collection.add("Dias");
        collection.add("Nur");
        collection.add("Ramadhan");
        collection.add("Code");
        collection.add("Okt 19");
        collection.add("Noermala");
        collection.addAll(Arrays.asList("Riska","Agustin"));

        collection.forEach(s -> {
            System.out.println(s);
        });

        System.out.println("REMOVE ");
        collection.remove("Dias");
        collection.forEach(s -> {
            System.out.println(s);
        });

        System.out.println(collection.contains("Dias"));
    }
}
