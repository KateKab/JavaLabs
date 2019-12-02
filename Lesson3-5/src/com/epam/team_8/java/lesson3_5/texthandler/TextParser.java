package com.epam.team_8.java.lesson3_5.texthandler;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser {
    public List<Sentence> parseToSentences(String text) {
        List<Sentence> result = new LinkedList<>();
        Pattern pattern = Pattern.compile("([^.!?]*[.!?]+)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            Sentence sentence = new Sentence();
            String sentenceString = matcher.group(0);
            sentence.setSentence(sentenceString);
            sentence.setWords(parseToWords(sentenceString));
            result.add(sentence);
        }
        return result;
    }

    public List<Word> parseToWords(String sentence) {
        List<Word> result = new LinkedList<>();
        Pattern pattern = Pattern.compile("([a-zA-Z0-9а-яА-Я]+)");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            Word word = new Word();
            word.setWord(matcher.group(0));
            result.add(word);
        }
        return result;
    }

}
