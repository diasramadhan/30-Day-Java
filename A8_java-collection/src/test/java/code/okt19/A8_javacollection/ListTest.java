package code.okt19.A8_javacollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {
    @Test
    void testList() {
        List<String> strings = List.of("Dias","Nur","Ramadhan");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Dias");
        arrayList.add("Nur");
        arrayList.add("Ramadhan");
        arrayList.add("Code");
        arrayList.add("Okt 10");

        List<Integer> integers = new ArrayList<>();

        for (String name : arrayList) {
            System.out.println(name);
        }

        System.out.println("=================");
        arrayList.set(0,"Noermala");
        for (String name : arrayList) {
            System.out.println(name);
        }
    }

    @Test
    void testImmutableList() {
        Person person =  new Person("Dias Nur Ramadhan",new ArrayList<>());

        person.addHobbies("Ngoding");
        person.addHobbies("Makan");
        person.addHobbies("Study");
        person.addHobbies("Pray");

        System.out.println(person.getHobbies());

//        doSomethingWithHobbies(person.getHobbies());
        System.out.println(person.getHobbies());

        System.out.println("============ IMMUTABLE LIST ==============");
        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();
        List<String> mutable = new ArrayList<>();
        mutable.add("Dias");
        mutable.add("Nur");
        mutable.add("Ramadhan");
        List<String> immutable = Collections.unmodifiableList(mutable);
        List<String> element = List.of("Dias","Nur","Ramadhan");

//        element.add("Noermla");
//        element.set(0,"Noermala");
        element.forEach(s -> {
            System.out.println(s);
        });
    }

    static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan Hobby");
    }

    @Test
    void testLinkedList() {

    }
}
