package code;

import org.junit.jupiter.api.Test;

public class InheritanceTest {
    @Test
    void testManager() {
        var manager = new Manager("Name");
        manager.name = "Dias Nur Ramadhan";
        manager.sayHello("Noermala");
    }

    @Test
    void testVicePresident() {
        VicePresident vicePresident = new VicePresident("Name");
        vicePresident.name = "Noermala Riska";
        vicePresident.sayHello("Dias Ramadhan");
    }
}
