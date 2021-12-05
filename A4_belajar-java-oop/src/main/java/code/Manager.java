package code;

public class Manager extends Employee{
    String company;

    public Manager(String name) {
        super(name);
    }

    public Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hi "+ name +  ",My name is Manager " + this.name);
    }

    void sayHelloCompany(){
        System.out.println("Hi "+ name +  ",My name is Manager " + this.name +
                " from company " + this.company);
    }
}
