package com.example.labo2.utils;

public class TextUtils {
    public static int getCharsCount(String userInputText) {
        if (userInputText != null) {
            return userInputText.replace(" ", "").length();
        }
        return 0;
    }

    public static int getNumbersCount(String userInputText) {
        int count = 0;
        char[] symbolsArray = userInputText.toCharArray();
        for (char c : symbolsArray) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static int getWordsCount(String userInputText) {
        if (userInputText.isEmpty())
            return 0;
        String[] words = userInputText.split("\\s+");
        return words.length;
    }
}