package oo2.ej3;

import java.util.List;

public class Document {
    private List<String> words;

    public long characterCount() {
        return this.words
                .stream()
                .mapToLong(w -> w.length())
                .sum();
    }
    public long calculateAvg() {
        return (long) characterCount() / this.words.size();
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }
// Resto del código que no importa
}

