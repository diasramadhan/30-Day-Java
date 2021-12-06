package code;

import Util.ValidationUtil;
import error.exception.DatabaseError;
import error.exception.ValidationException;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ErrorTest {
    @Test
    void testValidation() throws ValidationException {
        LoginRequest request = new LoginRequest("Dias Ramadhan",null);

        ValidationUtil.validate(request);
    }

    @Test
    void testValidationTryCatch() {
        LoginRequest request = new LoginRequest("Dias Ramadhan",null);

        try {
            ValidationUtil.validate(request);
            System.out.println("Data Valid");
        } catch (ValidationException e) {
            System.out.println("Data tidak valid : "+ e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Data null : " + e.getMessage());
        }
    }

    @Test
    void testRuntimeException() {
        LoginRequest loginRequest = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest);
        System.out.println("Sukses");
    }
    void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
        System.out.println("Berhasil konek username : " + username);
    }

    @Test
    void testErrorException() {
        connectDatabase("Dias Nur Ramadhan","Password");
    }

    @Test
    void testNonTryWithResource() {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("READMEI.md"));
            while (true){
                String line = reader.readLine();

                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch (Throwable throwable){
            System.out.println(throwable.getMessage());
        }finally {
            if (reader != null){
                try {
                    reader.close();
                    System.out.println("Sukses Menutup");
                }catch (IOException e){
                    e.getMessage();
                }
            }
        }
    }

    @Test
    void testTryWithResource() {

        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))){
            while (true){
                String line = reader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch (Throwable throwable){
            System.out.println(throwable.getMessage());
        }

    }
}
