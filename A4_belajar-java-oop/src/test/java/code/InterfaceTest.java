package code;

import org.junit.jupiter.api.Test;

public class InterfaceTest {
    @Test
    void testCar() {
        Car car = new Car() {
            @Override
            public String getBrand() {
                return "CAR RACER";
            }

            @Override
            public void drive() {
                System.out.println("Car Drive");
            }

            @Override
            public int getTire() {
                return 0;
            }
        };

        Car avanza =  new Avanza();
        avanza.drive();
        System.out.println(avanza.getTire());
    }
}
