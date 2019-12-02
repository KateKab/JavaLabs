package com.epam.team_8.java.lesson3_5.texthandler;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Runner {


    public static void main(String[] args) {
        String book = "book";
        FileHandler fileHandler = new FileHandler(book);
        fileHandler.backup();
        TextParser parser = new TextParser();
        List<Sentence> sentences = parser.parseToSentences(fileHandler.read());
        Collections.sort(sentences, new SentenceComparator());
        TableConstructor constructor = new TableConstructor();
        String table = constructor.create(sentences);
        fileHandler.write(table);
        System.out.println(fileHandler.read());

    }
}
