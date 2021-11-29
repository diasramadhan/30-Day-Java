package code;

import org.junit.jupiter.api.Test;

public class IfStatmentTest {
    @Test
    void testIf() {
        var nilai = 80;
        var absen = 50;

        var kkm = 75;
        var lulusNilai = nilai > kkm;
        var lulusAbsen = absen > kkm;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);

        if (nilai >= 75 && absen >= 75){
            System.out.println("lulus");
        }else {
            System.out.println("Coba lagi");
        }

        if (nilai >= 80 && absen >= 80){
            System.out.println("Nilai anda A");
        }else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }

    }
}
