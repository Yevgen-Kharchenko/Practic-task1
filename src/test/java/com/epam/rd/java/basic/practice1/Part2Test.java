package com.epam.rd.java.basic.practice1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Part2Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void shouldPrintSumIfTwoPositive() {
        Part2.main(new String[]{"1", "2"});
        assertEquals("3", outContent.toString());
    }
    @Test
    public void shouldPrintSumIfTwoNegative() {
        Part2.main(new String[]{"-1", "-2"});
        assertEquals("-3", outContent.toString());
    }
    @Test
    public void shouldPrintSumIfOnePositiveOneNegative() {
        Part2.main(new String[]{"1", "-2"});
        assertEquals("-1", outContent.toString());
    }
}