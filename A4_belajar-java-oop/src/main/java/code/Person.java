package code;

public class Person {
    String name;
    String address;
    final String contry = "Indonesia";

    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name);
    }

    void sayHello(){
        this.sayHello("Boss");
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(String name) {
        this(name,null);
    }

    public Person() {
        this(null);
    }
}
