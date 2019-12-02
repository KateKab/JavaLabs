package com.epam.team_8.java.lesson3_5.texthandler;

import java.util.Comparator;


public class SentenceComparator implements Comparator<Sentence> {

    @Override
    public int compare(Sentence o1, Sentence o2) {
        int result = 0;
        if (o1.countNumOfWords() < o2.countNumOfWords()) {
            result = -1;
        }
        if (o1.countNumOfWords() > o2.countNumOfWords()) {
            result = 1;
        }
        return result;
    }
}
