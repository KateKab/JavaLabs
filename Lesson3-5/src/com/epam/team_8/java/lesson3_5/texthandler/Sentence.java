package com.epam.team_8.java.lesson3_5.texthandler;

import java.util.LinkedList;
import java.util.List;

public class Sentence {
    private String sentence;
    private List<Word> words = new LinkedList<>();

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public void addWord(Word word) {
        words.add(word);
    }

    public int countNumOfWords() {
        return words.size();
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence='" + sentence + '\'' +
                ", words=" + words +
                '}';
    }
}
