package code;

import org.junit.jupiter.api.Test;

public class InvariantTest {
    @Test
    void testMyData() {
        MyData<String> myData = new MyData<>("Dias Nur Ramadhan");
        System.out.println(myData.getData());

        MyData<String> meneruskan = myData;
        System.out.println(meneruskan.getData());

//        MyData<Object> objectMyData = myData;
//        doIt(myData);

        MyData<Object> objectMyData = new MyData<>("Ini adalah String");
        System.out.println(objectMyData.getData());

//        MyData<String> stringMyData = objectMyData;
    }

    public static void  doIt(MyData<Object> objectMyData){
        //do somthing
    }
}
