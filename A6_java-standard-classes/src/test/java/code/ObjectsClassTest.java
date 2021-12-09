package code;

import org.junit.jupiter.api.Test;

import java.util.Objects;

public class ObjectsClassTest {
    public static void execute(Data data){
        if (data != null){
            System.out.println(data.toString());
            System.out.println(data.hashCode());
        }
    }
    public static void executeObjects(Data data){

        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }

    @Test
    void testObjectsClass() {
        execute(new Data("Dias Nur Ramadhan"));
    }
}
