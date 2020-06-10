package ru.test;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CurrentDataTest {

    @Test
    public void getData() throws IOException {

        assertNotNull(new CurrentData().getData());
    }
}