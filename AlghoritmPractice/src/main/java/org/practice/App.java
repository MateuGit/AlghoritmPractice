package org.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    }

    //Activity 1
    public static Boolean isPalindrome(String word) {
        word = word.replaceAll(" ", "");
        StringBuilder builder = new StringBuilder(word);
        return word.equals(builder.reverse().toString());
    }

    public static int value(Character r) {
        Map values = new HashMap<Character, Integer>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        return  values.get(r);
    }

    //Activity 2
    public static int romanToDecimal(String romanNumber) {
        int value = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            int letterValue = value(romanNumber.charAt(i));
            if (i + 1 < romanNumber.length()) {
                int nextLetterValue = value(romanNumber.charAt(i + 1));
                if (letterValue >= nextLetterValue) {
                    value += letterValue;
                } else {
                    value += nextLetterValue - letterValue;
                    i++;
                }
            } else {
                value += letterValue;
                i++;
            }
        }
        return value;
    }

    //Activity 3
    public static String revertWords(String words) {
        String[] wordArray = words.split(" ");
        String revertedWords = "";
        for (String wordReverted : wordArray) {
            revertedWords = wordReverted + " " + revertedWords;
        }
        return revertedWords;
    }

    //Activiy 4
    public static String countLettersNumbersWhiteSpaces(String text) {
        Integer lettersCount = 0;
        Integer numbersCount = 0;
        Integer whiteSpaces = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) lettersCount++;
            else if (Character.isDigit(text.charAt(i))) numbersCount++;
            else if (Character.isSpaceChar(text.charAt(i))) whiteSpaces++;
        }
        return "Digits: " + numbersCount + " Letters: " + lettersCount + " WhiteSpaces: " + whiteSpaces;
    }

    //Activity 5
    public static String Caesar(String word) {
        char[] characters = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            characters[i] = (char) (word.charAt(i) + 1);
        }
        word = String.copyValueOf(characters);
        return word;
    }

}

