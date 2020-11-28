package com.epam.rd.java.basic.practice1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Part7Test {
    @Test
    public void stringColumnShouldReturnNumberOfColumn(){
        assertEquals(1 ,Part7.str2int("A"));
    }
    @Test
    public void numberOfColumnShouldReturnStringOfColumn(){
        assertEquals("A", Part7.int2str(1));
    }
    @Test
    public void nextStringOfColumn(){
        assertEquals("B", Part7.rightColumn("A"));
    }

}