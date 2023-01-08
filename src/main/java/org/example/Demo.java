package org.example;

import java.util.function.Function;

public class Demo {

    public boolean compareString(String first, String second) {
        if (first.equalsIgnoreCase(second)) {
            return true;
        } else {
            return false;
        }
    }

    public String concatString(String first, String second) {
        return first.concat(second);
    }

    public int[] addOneToEachArrayElement(int[] numbers) {

        int length = numbers.length;

        int output[] = new int[length];

        for (int i = 0; i < length; i++) {
            output[i] = numbers[i] + 1;
        }

        return output;
    }

    public void performance() {
        for (int i = 0; i < 1_000_000_000; i++) {

        }
        System.out.println("===========================");
    }


    public boolean isPositive(int a) {
        if (a <= 0) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    void lambdaExample() {
        Function<String, String> function = x -> test(x);
        function.apply("AAAA");
    }

    String test(String a) {

        System.out.println("Test");
        return a;
    }

}
