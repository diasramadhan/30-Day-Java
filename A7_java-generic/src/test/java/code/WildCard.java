package code;

import org.junit.jupiter.api.Test;

public class WildCard {

    @Test
    void testPrintData() {
        MyData<String>[] myData = new MyData[]{
                new MyData("Dias"),
                new MyData("Nur")
        };

        printLength(myData);
    }

    public static void printLength(MyData<?>[] data){
        System.out.println(data.length);
    }
}
