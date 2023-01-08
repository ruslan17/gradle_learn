package org.example;


public class Main {

    public static int sum(int n) {

        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }

        return result;
    }

    public static void main(String[] args) {

        testSumPositive();
        testSumNegative();

//        System.out.println(sum(5)); // 15

    }

    private static void testSumPositive() {

        int actualResult = sum(5);
        int expectedResult = 15;

        if (expectedResult == actualResult) {
            //
        } else {
            throw new RuntimeException("Test testSum failed");
        }
    }

    private static void testSumNegative() {

        int actualResult = sum(-5);
        int expectedResult = 0;

        if (expectedResult == actualResult) {
            //
        } else {
            throw new RuntimeException("Test testSum failed");
        }
    }
}