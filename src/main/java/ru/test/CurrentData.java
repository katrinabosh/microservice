package ru.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public class CurrentData {


    public byte[] getData() throws IOException {

        try (InputStream stream = getClass().getResourceAsStream("/application.yml")) {
            return stream.readAllBytes();
        }
    }
}
