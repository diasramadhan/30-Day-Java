package code;

import org.junit.jupiter.api.Test;

public class AnnonymousClassTest {
    @Test
    void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        helloWorld.sayHello();
        helloWorld.sayHello("Mala");

    }
}
