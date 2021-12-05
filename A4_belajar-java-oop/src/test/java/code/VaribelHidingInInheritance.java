package code;

import org.junit.jupiter.api.Test;

public class VaribelHidingInInheritance {
    @Test
    void testParent() {
        Parent parent = new Parent();
        parent.name = "Dias Nur Ramadhan";
        parent.doIt();
        System.out.println(parent.name);
    }

    @Test
    void testChild() {
        Child child = new Child();
        child.name = "Noermla Riska";

        child.doItFromParent();
        child.doIt();
        System.out.println(child.name);
    }
}
