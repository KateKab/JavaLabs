package com.epam.team8.Lesson8_9.collections.parsers;

import com.epam.team8.Lesson8_9.collections.exceptions.InvalidDataException;

import java.util.Collection;

public interface Parser<T> {
    T parse(String string) throws InvalidDataException;

    Collection<T> parseAll(Collection<String> lines);
}
