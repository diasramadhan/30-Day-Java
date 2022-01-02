package code;

import org.junit.jupiter.api.Test;

public class ContraVariant {
    @Test
    void testContravariant() {
        MyData<Object> objectMyData = new MyData<>("Noermala Riska Agustin");
        objectMyData.setData(10000);

        changeToDias(objectMyData);
        System.out.println(objectMyData.getData());

    }

    public static void changeToDias(MyData<? super String> myData){
//        String value = (String) myData.getData();
        Object valueObj = myData.getData();
              myData.setData("Dias Nur Ramadhan");


    }
}
