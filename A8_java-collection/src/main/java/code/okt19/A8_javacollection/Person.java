package code.okt19.A8_javacollection;

import java.util.*;

public class Person implements Comparable<Person> {

    private String name;
    private List<String> hobbies;

    public Person(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }
    public Person(String name ){
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
//        return hobbies;
        return Collections.unmodifiableList(hobbies);
    }

    public void addHobbies(String   hobbies) {
        this.hobbies.add(hobbies);
    }


    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
