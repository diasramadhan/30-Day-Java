package code;

import org.junit.jupiter.api.Test;

public class ScopeTest {
    @Test
    void testScope() {
        sayHello("Dias");
    }
    static void sayHello(String name){
        String hello = "Hello " + name;

        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
    }
}
