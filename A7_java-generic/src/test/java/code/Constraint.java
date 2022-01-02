package code;

import org.junit.jupiter.api.Test;

public class Constraint {

    @Test
    void testNumberData() {
        NumberData<Integer> integerNumberData = new NumberData<>(10000);

        Integer data = integerNumberData.getData();
        System.out.println(data);
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {

            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

}
