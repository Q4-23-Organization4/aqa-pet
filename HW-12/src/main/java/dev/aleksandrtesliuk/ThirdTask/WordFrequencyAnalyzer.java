package dev.aleksandrtesliuk.ThirdTask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WordFrequencyAnalyzer {
    private final List<String> words;
    private final Map<String, Integer> frequencyMap;

    // Конструктор
    public WordFrequencyAnalyzer(List<String> words) {
        this.words = words;
        this.frequencyMap = new HashMap<>();
    }

    public void calculateFrequencies() {
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
    }

    public void printFrequencies() {
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Word: '" + entry.getKey() + "' - frequency: " + entry.getValue());
        }
    }
}
