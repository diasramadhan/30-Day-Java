package code;

import org.junit.jupiter.api.Test;

public class BreakAndContinueTest {
    @Test
    void testBreakWhile() {
        var counter = 1;
        while (true){
            System.out.println("Perulangan ke-" + counter);
            counter++;
            if (counter > 10){
                break;
            }
        }
    }

    @Test
    void testContinueWhile() {
        var counter = 1;

        while (counter < 10){
            System.out.println("Number Ganjil : " + counter);
            counter++;
            if (counter % 2 == 0){
                continue;
            }
        }
    }

    @Test
    void testForBreak() {
        for (int i = 1; i < 10; i++) {
            if (i > 5){
                break;
            }
            System.out.println("Perulangan ke"+ i);
        }
    }

    @Test
    void testForContinue() {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0){
                continue;
            }
            System.out.println("Ganjil : " + i);
        }
    }
}
