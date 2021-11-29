package code;

import org.junit.jupiter.api.Test;

public class KomentarTest {
    @Test
    void Comment() {
        int sum = sum(1, 8);
        System.out.println(sum);
    }

    /**
     * Method untuk mennjumlahkan value1 dan value2
     * @param value1
     * @param value2
     * @return hasil pennjumlahan value1 dan value2
     */
    int sum(int value1, int value2){
        //jumlhkan
        return value1+ value2;
    }
}
