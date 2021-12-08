package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TestWorkTest {

    private TestWork tw = new TestWork();
    private int[] numbers = {-898, 0, 787, 777, -859897};
    private int[] orderedNumber = {-859897, -898, 0, 777, 787};
    private int[] reverseOrderedNumber = {787, 777, 0, -898, -859897};
    private final int MAX_FROM_NUMBER = 787;

    @Test
    void maximumOf2() {
        assertEquals(Integer.MAX_VALUE, tw.maximumOf2(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void maxNumFromArray() {
        assertEquals(MAX_FROM_NUMBER, tw.maxNumFromArray(numbers));
    }

    @Test
    void sortNumbers() {
        assertArrayEquals(orderedNumber, tw.sortNumbers(numbers));
    }

    @Test
    void sortInverseNumbers() {
        assertArrayEquals(reverseOrderedNumber, tw.sortInverseNumbers(numbers));
    }

    @Test
    void invertWord() {
        String s = "мама мыла раму";
        String rS = "умар алым амам";
        assertEquals(rS, tw.invertWord(s));
    }

    @Test
    void upperCaseFirstSymbolEachWord() {
        String s = "Каждое слово должно начинаться с заглавной буквы, а остальные буквы должны бЫть в нижнем регИстре";
        String edS = "Каждое Слово Должно Начинаться С Заглавной Буквы, А Остальные Буквы Должны Быть В Нижнем Регистре";
        assertEquals(edS, tw.upperCaseFirstSymbolEachWord(s));
    }

    @Test
    void calcCharacterFrequency() {
        String text = "маМа мыла рАму";
        assertEquals("{а=4,  =2, р=1, у=1, ы=1, л=1, м=4}", tw.calcCharacterFrequency(text));
        text = "Посчитать сколько раз каждый символ встречается в слове, игнорируя регистр";
        assertEquals("{р=6, с=7, т=5, у=1, ч=2, ы=1, ь=2, я=2,  =9, ,=1, а=4, в=4, г=2, д=1, е=4, ж=1, з=1, и=5, й=1, к=3, л=3, м=1, н=1, о=6, п=1}",
                tw.calcCharacterFrequency(text));
    }

    @Test
    void isWordStartWith() {
        String start = "Hell";
        String text = "hello, World!";
        assertTrue(tw.isWordStartWith(start, text));
    }
}