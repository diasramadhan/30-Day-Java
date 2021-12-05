package code;

import org.junit.jupiter.api.Test;

public class PolymorphismTest {
    @Test
    void testEmployee() {
        Employee employee = new Employee("Dias Nur Ramadhan");
        employee.sayHello("Noermala Riska");
    }

    @Test
    void testManager() {
        Employee manager = new Manager("Noermala");
        manager.sayHello("Dias Ramadhan");

        Employee manager2 = new Manager("Human","company");
//        manager2.sayHelloCompany(); //tidak tersedia
    }

    @Test
    void testMannagerWithCompany() {
        Manager manager = new Manager("Dias","Code Okt 19");
        manager.sayHelloCompany();
    }

    void sayHelloPholimorpism(Employee employee){
        System.out.println("Hello " + employee.name);
    }

    @Test
    void testSayHelloPholimorpism() {
        sayHelloPholimorpism(new Employee("Noermala"));
        sayHelloPholimorpism(new Manager("Dias"));
        sayHelloPholimorpism(new VicePresident("Ramadhan"));
    }

    void testSayHelloWithInstaceOf(Employee employee) {
        if (employee instanceof  Manager){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello From VP " + vicePresident.name);

        }else if (employee instanceof VicePresident){
            Manager manager = (Manager) employee;
            System.out.println("Hello From Manager "+ manager.name);

        }else {
            System.out.println("Hello From Employee "+ employee.name);
        }
    }

    @Test
    void testTypeCheck() {
        testSayHelloWithInstaceOf(new VicePresident("Ramadhan"));
    }
}
