package code;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
    void sayHello(String name){
        System.out.println("Hi "+ name +  ",My name is Manager " + this.name);
    }
}
