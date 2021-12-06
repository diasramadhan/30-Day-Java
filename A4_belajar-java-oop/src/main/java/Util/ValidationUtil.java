package Util;

import Annotation.NotBlank;
import code.LoginRequest;
import error.exception.BlankException;
import error.exception.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest)
            throws ValidationException,NullPointerException{
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if (loginRequest.username().isBlank()){
            throw new ValidationException("Username is blank");
        }else if (loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        }else if (loginRequest.password().isBlank()){
            throw new ValidationException("Password is blank");
        }
    }
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if (loginRequest.username().isBlank()){
            throw new RuntimeException("Username is blank");
        }else if (loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        }else if (loginRequest.password().isBlank()){
            throw new RuntimeException("Password is blank");
        }
    }

    public static void validateReflection(Object o ){
        Class aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields){
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null ){
                //validate
                try {
                    String value = (String) field.get(o);

                    if (value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
