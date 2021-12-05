package code;

import org.junit.jupiter.api.Test;

import java.beans.Customizer;

public class EnumTest {

    class Customers {
        private String name;
        private Level level;

        public Customers() {
        }

        public Customers(String name, Level level) {
            this.name = name;
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Level getLevel() {
            return level;
        }

        public void setLevel(Level level) {
            this.level = level;
        }
    }
    @Test
    void testLevelEnum() {
        Customers customers = new Customers("Dias",Level.PREMIUM);
        System.out.println(customers.getName());
        System.out.println(customers.getLevel());
        System.out.println(customers);
    }
}
