package code;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ScannerTest {
    @Test
    void testScannerInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = scanner.nextLine();

        System.out.println(name);
    }
}
