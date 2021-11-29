package code;

import org.junit.jupiter.api.Test;

public class TipeDataTest {
    @Test
    void testTipeDataNumber() {
        //decimal number
        byte thisByte = 100;
        short thisShort = 10_000;
        int thisInt = 1_000_000_000;
        long thisLong = 1_000_000_000;
        long thisTrueLong = 1_000_000_000_000_000_000L;

        //float numer
        float thisFLoat = 10.10f;
        double thisDouble = 10.10d;

        //literals number
        int decimalInt = 34;
        int hexaDecimal = 0x22;
        int binaryDecimal = 0b100010;

        System.out.println(decimalInt);
        System.out.println(hexaDecimal);
        System.out.println(binaryDecimal);
    }

    @Test
    void testTipeDataChar() {
        char d = 'D';
        char i = 'I';
        char a = 'A';
        char s = 'S';

        char var1 = '5';
        char var2 = '$';

        System.out.println(var1);
        System.out.println(var2);
        

        var1 = '\u00B5';
        var2 = '\u00BD';
        char var3 = '\u00C6';

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);

        var1 = '\'';
        var2 = '\n';
        var3 = '\"';

        System.out.print(var1);
        System.out.print("var 2 : " + var2);
        System.out.print(var3);

        int iniInt = 1;
        char b = (char) iniInt;
        System.out.println(b);
    }

    @Test
    void testTipeDataBoolean() {
        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);
    }
    @Test
    void testTipeDataString(){
        String name = "Dias Nur Ramadhan";
        String biodata = """
                Nama : Dias Nur Ramadhan
                Npm  : 2013020171
                """;
        System.out.println(biodata);
    }
}
