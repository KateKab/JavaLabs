package com.epam.team_8.java.lesson3_5.texthandler;

import java.io.*;
import java.nio.file.Files;

public class FileHandler {
    private static final String RESOURCES_ORIGINAL = "\\resources\\original\\";
    private static final String TXT = ".txt";
    private static final String RESOURCES_BACKUP = "\\resources\\backup\\";
    private static final String BAK = ".bak";
    private String fileName;
    private String sourcePath;
    private String backupPath;
    private File sourceFile;
    private File backupFile;


    public FileHandler(String fileName) {
        this.fileName = fileName;
        generatePath();
        createFile();
    }

    private void createFile() {
        sourceFile = new File(sourcePath);
        backupFile = new File(backupPath);
    }

    public String read() {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            String buffer;
            while ((buffer = reader.readLine()) != null) {
                result.append(buffer);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result.toString();
    }

    private void generatePath() {
        String userDir = System.getProperty("user.dir");
        sourcePath = userDir + RESOURCES_ORIGINAL + fileName + TXT;
        backupPath = userDir + RESOURCES_BACKUP + fileName + BAK;
    }

    public void write(String text) {
        try (FileWriter writer = new FileWriter(sourcePath, true)) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void backup() {
        try {
            Files.copy(sourceFile.toPath(), backupFile.toPath());
        } catch (IOException e) {
            System.out.println("Can't backup file"
            + e.getMessage());
        }
    }
}


