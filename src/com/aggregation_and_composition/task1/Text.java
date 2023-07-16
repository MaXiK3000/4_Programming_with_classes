package com.aggregation_and_composition.task1;

import java.util.Arrays;

public class Text {
    private String title;
    private Sentence[] sentences;

    public Text() {
    }

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public Text(String title, Sentence[] sentences) {
        this.title = title;
        this.sentences = sentences;
    }

    public void printText() {
        StringBuilder text = new StringBuilder();
        for (Sentence sent : sentences) {
            text.append(sent.convertWords()).append(" ");
        }
        System.out.println(text.toString().trim());
    }

    public void printTitle() {
        System.out.println("Заголовок текста: " + this.title);
    }

    public void completeText(Sentence... sentenceAdd) {
        Sentence[] newText = Arrays.copyOf(this.sentences, this.sentences.length + sentenceAdd.length);
        System.arraycopy(sentenceAdd, 0, newText, this.sentences.length, sentenceAdd.length);
        this.sentences = newText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }
}
