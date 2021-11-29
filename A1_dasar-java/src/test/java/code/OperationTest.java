package code;

import org.junit.jupiter.api.Test;

public class OperationTest {
    @Test
    void testBoolean() {
        var absen = 75;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }

    @Test
    void testMath() {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        int d = 100;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

    }

    @Test
    void testPembanding() {
        int a = 100;
        int b = 100;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }

    @Test
    void testTeraryOperator() {
        var nilai = 75;
        String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba lagi";

        System.out.println(ucapan);
    }
}
