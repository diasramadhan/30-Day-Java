package code;

import org.junit.jupiter.api.Test;

public class AbstactClassTest {
    @Test
    void testLocation() {
//        Location location = new Location(); //ERROR ABSTRACT CLASS
        Location location = new Location() {

        };

        System.out.println(location);
    }

    @Test
    void City() {
        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
        System.out.println(city);
    }

    @Test
    void Animals() {
        Animal animal = new Animal() {
            @Override
            void run() {
                System.out.println("Animal goes in here");
            }
        };

        animal.run();

        Animal cat = new Cat();
        cat.name = "Noermala";
        cat.run();
    }
}
