package code;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertierClassTest {
    @Test
    void testProperties() {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("App.properties"));

            String name = properties.getProperty("name");
            System.out.println(name);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testAddProperties() {
        Properties properties = new Properties();
        properties.put("age","19");
        properties.put("Prodi","Teknik Informatika");

        try {
            properties.store(new FileOutputStream("App.properties"),"");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
