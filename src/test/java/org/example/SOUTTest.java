package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SOUTTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    private final PrintStream originalOut = System.out;

    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {

        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {

        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void testOut() {

        System.out.print("hello");
        assertEquals("hello", outContent.toString());
    }

    @Test
    void testErr() {

        System.err.print("error");
        assertEquals("error", errContent.toString());
    }

}
