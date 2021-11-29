package code;

import org.junit.jupiter.api.Test;

public class MethodTest {
    @Test
    void testMethod() {
        sayHelloGirlFriend();
        sayHelloGirlFriend();
        sayHelloGirlFriend();
    }
    void sayHelloGirlFriend(){
        System.out.println("Hello Mala 1");
        System.out.println("Hello Mala 2");
        System.out.println("Hello Mala 3");
    }

    @Test
    void testMethodOverloading() {
        sayHello();
        sayHello("Mala");
        sayHello("Noermala","Riska");
    }
    void sayHello(){
        System.out.println("Hello");
    }
    void sayHello(String name){
        System.out.println("Hello " + name);
    }
    void sayHello(String fName,String lName){
        System.out.println("Hello "+ fName +" "+ lName );
    }

    @Test
    void testMethodParameter() {
        sayHello("Dias","Ramadhan");
    }

    @Test
    void testMethodReturnValue() {
        var result = sum(100,100);
        System.out.println(result);

        System.out.println(sum(200,300));

        System.out.println(hitung(100,200,"-"));
        System.out.println(hitung(100,200,"+"));
    }
    int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }
    double hitung(double value1, double value2,String operation){
        switch (operation){
            case "+" -> {
                return value1 + value2;
            }

            case "-" -> {
                return value1 - value2;
            }

            default -> {
                return 0;
            }
        }
    }

    @Test
    void testRescursiveMethod() {
        System.out.println(faktorialLoop(10));
        System.out.println(faktorialRescursive(10));
        loop(10);
    }

    int faktorialLoop(int value){

        var result = 1;
        for (int i = 1; i <= value ; i++) {
            result = result * i;
        }
        return result;
    }

    int faktorialRescursive(int value){
        if (value == 1) {
            return value;
        }else {
            return value*faktorialRescursive(value-1);
        }
    }
    void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
}
