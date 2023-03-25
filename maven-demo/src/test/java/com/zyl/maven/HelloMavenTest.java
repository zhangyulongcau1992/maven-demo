package com.zyl.maven;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloMavenTest {

    @Test
    public void helloMaven() {
        HelloMaven helloMaven = new HelloMaven();
        String actual = helloMaven.helloMaven();
        String expected = "hello maven";
        assertEquals(expected, actual);
    }
}