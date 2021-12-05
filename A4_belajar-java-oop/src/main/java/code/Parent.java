package code;

public class Parent {
    String name;
    void doIt(){
        System.out.println("Do it From Parent");
    }
}
class Child extends Parent{
    String name;

    void doItFromParent() {
        System.out.println("=== Parent ===");
        super.doIt();
    }

    @Override
    void doIt() {
        System.out.println("Do it from Child");
    }
}
