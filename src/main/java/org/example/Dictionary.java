package org.example;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private List<String> words = new ArrayList<>();

    public void addWord(String word) {
        words.add(word);
    }

    public List<String> getWordsInDictionary() {
        return words;
    }

}
