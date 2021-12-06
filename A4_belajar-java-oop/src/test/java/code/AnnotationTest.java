package code;

import Annotation.CreateUserRequest;
import Annotation.Fancy;
import Util.ValidationUtil;
import org.junit.jupiter.api.Test;

public class AnnotationTest {
    @Test
    void testApp() {

    }
    @Fancy(name = "Dias",tags = {"app","java"})
    public class App{

    }

    @Test
    void testReflection() {
        CreateUserRequest userRequest = new CreateUserRequest();
        userRequest.setName("Dias");

        ValidationUtil.validateReflection(userRequest);

    }
}
