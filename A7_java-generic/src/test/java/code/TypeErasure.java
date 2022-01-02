package code;

import org.junit.jupiter.api.Test;

public class TypeErasure {
    @Test
    void testMyData() {
        MyData myData = new MyData("Dias Nur Ramadhan");

        System.out.println(myData.getData());

        MyData intMyData = new MyData(10000);
        MyData<Integer> dataInteger = intMyData;
        System.out.println(dataInteger.getData()   );

    }
}
