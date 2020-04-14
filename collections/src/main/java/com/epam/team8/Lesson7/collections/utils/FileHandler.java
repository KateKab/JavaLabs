package com.epam.team8.Lesson7.collections.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileHandler {
    public static final String DATA_DIR = System.getProperty("user.dir") +
            "\\src\\main\\resources\\";

    public List<String> read(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(DATA_DIR + fileName));
    }

    public void write(String fileName, List<String> lines) throws IOException {
        Files.write(Paths.get(DATA_DIR + fileName), lines);
    }
}
