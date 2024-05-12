package dev.aleksandrtesliuk.ThirdTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("Apple");
        words.add("apple");
        words.add("Banana");
        words.add("cherry");
        words.add("apple");
        words.add("banana");

        WordFrequencyAnalyzer analyzer = new WordFrequencyAnalyzer(words);
        analyzer.calculateFrequencies();

        System.out.println("Word frequency:");
        analyzer.printFrequencies();
    }
}
