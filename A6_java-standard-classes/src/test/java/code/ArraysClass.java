package code;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraysClass {
    @Test
    void testMethodArray() {
       int[] numbers = {
               78,12,1,2,3,4,5,6,7,8,9,0,0,98,3,2,1,1,12,2,34,5,6,
       };

       Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers,72));
        System.out.println(Arrays.binarySearch(numbers,78));
        System.out.println(Arrays.binarySearch(numbers,0));
    }
}
