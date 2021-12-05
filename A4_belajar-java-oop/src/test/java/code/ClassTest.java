package code;

import org.junit.jupiter.api.Test;

public class ClassTest {
    @Test
    void testObject() {
        Person person1 = new Person();
        var person2 = new Person();
        Person person3;
        person3 = new Person();
    }

    @Test
    void testField() {
        Person person = new Person("Dias","Nganjuk");
        person.name = "Dias Nur Ramadhn";
        person.address = "Nganjuk";
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.contry);

        person.sayHello("Noermala");
        person.sayHello();

    }
}
