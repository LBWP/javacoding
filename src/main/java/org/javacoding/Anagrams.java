package org.javacoding;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by laura on 2/5/14.
 */
public class Anagrams {
             Object
    Logger logger = Logger.getLogger(Anagrams.class);

    // Determines whether two strings are anagrams
    public boolean stringsAreAnagrams(String string1, String string2) {
        logger.debug("Start stringsAreAnagrams: string1 = " + string1 + ", string2 = " + string2);
        long startTime = System.nanoTime();

        boolean stringsAreAnagrams = true;
        HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();
        // count the characters to make sure you don't match e.g. "cats" and "tac"
        int numCharacters = 0;

        StringBuilder stringBuilder1 = new StringBuilder(string1);
        StringBuilder stringBuilder2 = new StringBuilder(string2);

        Character currentChar;
        Integer currentVal;
        // Loop through the first string and put each character into a HashMap
        // Increment the value if you've already encountered this character
        for (int i = 0; i < stringBuilder1.length(); i++) {
            currentChar = Character.toLowerCase(stringBuilder1.charAt(i));
            currentVal = 0;
            if (currentChar != ' ') {
                if (characterMap.containsKey(currentChar)) {
                    currentVal = characterMap.get(currentChar);
                }
                characterMap.put(currentChar, currentVal + 1);
                numCharacters++;
            }
        }
        // Loop through the second string and see if each character exists
        // as a key in the HashMap with a value greater than 0. Decrement
        // the value after you find each character in the HashMap
        for (int i = 0; i < stringBuilder2.length(); i++) {
            currentChar = Character.toLowerCase(stringBuilder2.charAt(i));
            if (currentChar != ' ') {
                if (!characterMap.containsKey(currentChar)) {
                    return false;
                } else {
                    currentVal = characterMap.get(currentChar);
                    if (currentVal <= 0) {
                        return false;
                    }
                    characterMap.put(currentChar, currentVal - 1);
                    numCharacters--;
                }
            }
        }

        // If numCharacters is greater than 0, the first string has more
        // non-space characters than the second string so they can't be anagrams
        if (numCharacters > 0) {
            stringsAreAnagrams = false;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        logger.info("End stringsAreAnagrams");
        logger.info("Time to run: " + duration + "\n");

        // If you made it through the second string without hitting
        // a failure condition, the two strings are anagrams
        return stringsAreAnagrams;
    }

}
