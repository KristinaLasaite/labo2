package com.example.labo2;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.labo2.utils.TextUtils;

public class ExampleUnitTest {
    @Test
    public void getCharsCountGiven_EmptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCountGiven_TenChar_result_Ten() {
        String givenString = "1234567890";
        int expectedValue = 10;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test (expected = NullPointerException.class)
    public void getCharsCountGiven_NullString_Result_Exception() {
        String givenString = null;
        int actualValue = TextUtils.getCharsCount(givenString);
    }

    @Test (expected = NullPointerException.class)
    public void getWordsCount_NullString_Result_Exception() {
        String givenString = null;
        int actualValue = TextUtils.getWordsCount(givenString);
    }

    @Test public void getWordsCount_ExpectedBehaviour() {
        String givenString = "Hello World";
        int expectedValue = 2;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test public void getWordsCount_EmptySpace() {
        String givenString = " ";
        int expectedValue = 1;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test public void getWordsCount_Symbols() {
        String givenString = ", = + - ! ; @ *";
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

}