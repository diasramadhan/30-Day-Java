package code.okt19.A8_javacollection;

import org.junit.jupiter.api.Test;

import java.util.*;

public class SetTest {
    @Test
    void testSetInterface() {
        Set<String> tidakTerurut = new HashSet<>();
        tidakTerurut.addAll(Set.of("Dias","Nur","Ramadhan"));

        tidakTerurut.forEach(s -> {
            System.out.println(s);
        });

        Set<String> terurut = new LinkedHashSet<>();
        terurut.addAll(Set.of("Dias","Nur","Ramadhan"));
        for (String s : terurut) {
            System.out.println(s);
        }

    }

    enum Gender{
        MALE,FEMALE,NOT_MENTION
    }

    @Test
    void testEnumSet() {
        Set<Gender> genders = EnumSet.allOf(Gender.class);
        for (var result : genders) {
            System.out.println(result);
        }
    }

    @Test
    void testIImmutable() {
        Collections.emptySet();
    }

    @Test
    void testComperable() {
        Person[] people = new Person[]{
                new Person("Nur"),
                new Person("Dias"),
                new Person("Ramadhan")
        };

        Arrays.sort(people);
        System.out.println();
    }

    class PersonComparator implements Comparator <Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }

        @Override
        public Comparator<Person> reversed() {
            return Comparator.super.reversed();
        }
    }

    @Test
    void testSortedSet() {
        SortedSet<Person> people = new TreeSet<>();
        people.add(new Person("Nur"));
        people.add(new Person("Dias"));
        people.add(new Person("Ramadhan"));

        people.forEach(person -> {
            System.out.println(person.getName());
        });

        System.out.println("==== COMPARATOR =====");
        SortedSet<Person> personSortedSet = new TreeSet<>(new PersonComparator().reversed());
        personSortedSet.add(new Person("Nur"));
        personSortedSet.add(new Person("Dias"));
        personSortedSet.add(new Person("Ramadhan"));

        personSortedSet.forEach(s -> {
            System.out.println(s.getName());
        });
    }

    @Test
    void testNavigableSet() {

        NavigableSet<String> navigableSet = new TreeSet<>();

        navigableSet.addAll(Set.of("Dias","Nur","Ramadhan","Code","Okt19"));

        NavigableSet<String> tailDias = navigableSet.tailSet("Dias", true);
        for (String result : tailDias) {
            System.out.println(result);
        }

        System.out.println("=====================");
        for (String result : navigableSet) {
            System.out.println(result);
        }
    }
}
