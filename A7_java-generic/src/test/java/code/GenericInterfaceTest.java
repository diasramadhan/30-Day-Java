package code;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class GenericInterfaceTest {
    @Test
    void testPerson() {
        Person[] people = {
                new Person("Noermala","Indonesia"),
                new Person("Dias","Indonesia"),
                new Person("Ramadhan","Indonesia")
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people,personComparator);

        System.out.println(Arrays.toString(people) );

    }





}
