package code;

import org.junit.jupiter.api.Test;

public class GenericClassTest {
    @Test
    void testData() {

        MyData<String> myData1 = new MyData<>("Dias Nur Ramadhan");
        MyData<Integer> myData2 = new MyData<>(10000);

        System.out.println(myData1.getData());
        System.out.println(myData2.getData());
    }

    @Test
    void testPair() {
        Pair<Integer,String> npmName = new Pair<>(2013020171,"Dias Nur Ramadhan");

        System.out.println(npmName);
        System.out.println(npmName.getFirst());
        System.out.println(npmName.getSecond());


    }


}
