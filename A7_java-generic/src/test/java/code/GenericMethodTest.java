package code;

import org.junit.jupiter.api.Test;

public class GenericMethodTest {
    @Test
    void testArrayHelper() {
        ArrayHelper arrayHelper = new ArrayHelper();

        Integer[]numbers = new Integer[]{
                1,2,3,5,6,67,8,9,90,0,0,1,24,56
        };
        System.out.println(ArrayHelper.count(numbers));

        System.out.println(ArrayHelper.count(new String[]{
                "Dias","Nur","Ramadhan"
        }));
    }
}
