package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DictionaryTest {

    Dictionary sut = new Dictionary();

    @BeforeEach
    void setUp() {

        sut = new Dictionary();

        sut.addWord("Apple");
        sut.addWord("Bed");
        sut.addWord("Citrus");
    }

    @Test
    void addWordDemo() {

        List<String> expectedResult = List.of("Apple", "Bed", "Citrus", "Demo");

        sut.addWord("Demo");

        assertEquals(expectedResult, sut.getWordsInDictionary());
    }

    @Test
    void addWordEagle() {

        List<String> expectedResult = List.of("Apple", "Bed", "Citrus", "Eagle");

        sut.addWord("Eagle");

        assertEquals(expectedResult, sut.getWordsInDictionary());
    }
}