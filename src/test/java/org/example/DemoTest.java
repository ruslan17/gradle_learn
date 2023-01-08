package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.function.Function;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class DemoTest {

    Demo sut = new Demo();

    @BeforeEach
    void setUp() {

        System.out.println("test started");
    }

    @AfterEach
    void tearDown() {

        System.out.println("test ended");
    }

    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }

    @Test
    void testCompareStringWhenNotEquals() {

        boolean expectedResult = false;

        boolean actualResult = sut.compareString("A", "B");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testCompareStringWhenEquals() {

        boolean expectedResult = true;

        boolean actualResult = sut.compareString("A", "A");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testCompareStringWhenCasesAreDifferent() {

        // arrange
        boolean expectedResult = true;

        // act
        boolean actualResult = sut.compareString("A", "a");

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void concatString() {

    }

    @Test
    void addOneToEachArrayElement() {

        // given
        int[] array = {1, 2};
        int[] expectedResult = {2, 3};

        // when
        int[] actualResult = sut.addOneToEachArrayElement(array);

        // then
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void performance() {

        assertTimeout(Duration.ofMillis(1), () -> sut.performance());

    }

    @Test
    void isPositive() {

        boolean expectedResult = true;

        boolean actualResult = sut.isPositive(5);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testIsPositiveWhenNegative() {

        assertThrows(IllegalArgumentException.class, () -> sut.isPositive(-5));

    }

}