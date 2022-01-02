package code;

import org.junit.jupiter.api.Test;

public class CovariantTest {
    @Test
    void testCovaraint() {
        MyData<String> myData = new MyData<>("Dias Nur Ramadhan");
        process(myData);

        MyData<? extends Object> data = myData;
        System.out.println(data.getData());

    }
    public static void process(MyData<? extends Object> myData){
//        myData.setData(100);
        System.out.println(myData.getData());
    }
}
