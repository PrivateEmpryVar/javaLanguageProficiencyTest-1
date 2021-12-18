package com.company;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestWork {

    public int maximumOf2(int a, int b) {
        return Math.max(a, b);
    }

    public int maxNumFromArray(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i ++){
            max = Math.max(max, numbers[i]);
        }
        return max;
    }

    public int[] sortNumbers(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    public int[] sortInverseNumbers(int [] numbers) {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        return numbers;
    }

    public String invertWord(String string) {
        StringBuilder reversed = new StringBuilder(string);
        reversed.reverse();
        return String.valueOf(reversed);
    }

    public String upperCaseFirstSymbolEachWord(String text) {
        String[] words = text.split(" ");
        String output = "";;
        for (String word : words){
            String first = word.substring(0,1).toUpperCase();
            String all = word.substring(1).toLowerCase();
            output = output + first + all + " ";
        }
        return output;
    }

    public String calcCharacterFrequency(String text) {
        text = text.toLowerCase();
        char[] chars = text.toCharArray();
        int [] indexOfChars = new int[1200];
        String output = "";

        for(int i = 0; i < chars.length; i++) {
            indexOfChars[chars[i]]++;
        }

        for (int i = 1000; i < indexOfChars.length; i++) {
            if (indexOfChars[i] != 0)
                output = (char)i + "=" + indexOfChars[i];
        }
        return output;
    }

    public boolean isWordStartWith(String start, String word) {
//        TODO 8. Определить начинается ли слова с определённой последовательности символов, игнорируя регистр.
        return false;
    }
}