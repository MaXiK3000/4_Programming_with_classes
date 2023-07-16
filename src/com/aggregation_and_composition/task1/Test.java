package com.aggregation_and_composition.task1;

public class Test {

    public static void main(String[] args) {
        Text text = new Text("Репка.", sentencesList);
        text.printTitle();
        System.out.println("\nИсходный текст: ");
        text.printText();
        System.out.println("\nИзмененный текст: ");
        text.completeText(sentencesAdd);
        text.printText();
    }

    private static Word[] createArrWords(String str) {
        String[] strArr = str.split(" ");
        Word[] words = new Word[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            words[i] = new Word(strArr[i]);
        }
        return words;
    }

    private static final Word[] words_01 = createArrWords("Сказка про репку");
    private static final Word[] words_02 = createArrWords("Посадил дед репку");
    private static final Word[] wordsAdd_01 = createArrWords("Вот и сказке конец");
    private static final Word[] wordsAdd_02 = createArrWords("А кто слушал молодец");
    private static final Sentence[] sentencesList = new Sentence[]{new Sentence('!', words_01),
            new Sentence('.', words_02)};
    private static final Sentence[] sentencesAdd = new Sentence[]{new Sentence('.', wordsAdd_01),
            new Sentence('!', wordsAdd_02)};
}
