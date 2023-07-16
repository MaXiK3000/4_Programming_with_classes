package com.aggregation_and_composition.task1;

public class Sentence {
    private Word[] words;
    private char sentenceEndSymbol;

    public Sentence() {
    }

    public Sentence(char sentenceEndSymbol, Word... words) {
        this.words = words;
        this.sentenceEndSymbol = sentenceEndSymbol;
    }

    public String convertWords() {
        StringBuilder sb = new StringBuilder();
        for (Word str : words) {
            sb.append(str.getWord()).append(" ");
        }
        return sb.toString().trim() + sentenceEndSymbol;
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }

    public char getSentenceEndSymbol() {
        return sentenceEndSymbol;
    }

    public void setSentenceEndSymbol(char sentenceEndSymbol) {
        this.sentenceEndSymbol = sentenceEndSymbol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Word w : this.words) {
            sb.append(w.getWord()).append(" ");
        }
        return sb.toString().trim() + this.sentenceEndSymbol;
    }
}
