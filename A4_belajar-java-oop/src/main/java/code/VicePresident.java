package code;

public class VicePresident extends Manager{

    public VicePresident(String name) {
        super(name);
    }

    @Override
    void sayHello(String name) {
        System.out.println("FROM PARENT");
        super.sayHello(name);

        System.out.println("FROM CHILD");
        System.out.println("Hi "+ name +  ",My name is VP " + this.name);
    }
}
