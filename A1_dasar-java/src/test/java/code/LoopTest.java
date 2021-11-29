package code;

import org.junit.jupiter.api.Test;

public class LoopTest {
    @Test
    void testDoWhile() {
        var counter = 100;
        do {
            System.out.println("Perulnagan ke " + counter);
            counter++;
        }while (counter <= 10);
    }

    @Test
    void testForEach() {
        String[] names = {
                "Dias","Nur","Ramadhan",
                "Noermala","Riska","Agustin"
        };

        for (var result :
                names) {
            System.out.println(result);
        }
    }

    @Test
    void testForLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    @Test
    void testWhileLoop() {
        var counter = 1;

        while (counter <= 10){
            System.out.println("Perulangan " + counter);

            counter++;
        }
    }
}
