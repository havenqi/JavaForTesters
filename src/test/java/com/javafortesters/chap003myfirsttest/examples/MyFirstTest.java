package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by havenqi on 8/2/15.
 */
public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo(){

        int answer = 3+2;
        assertEquals("3+2=5", 5, answer);

    }
}
