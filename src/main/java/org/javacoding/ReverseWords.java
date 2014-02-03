package org.javacoding;

import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: laura
 * Date: 1/30/14
 * Time: 8:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class ReverseWords {
    private final Logger logger = Logger.getLogger(ReverseWords.class);


    public String reverseString(String inputString) {
        StringBuilder reversedString = new StringBuilder(inputString);
        char tempChar;
        int inputStringLength = inputString.length();

        for (int i = 0; i < inputStringLength / 2; i++) {
            tempChar = reversedString.charAt(i);

            reversedString.setCharAt(i, reversedString.charAt(inputStringLength - 1 - i));
            reversedString.setCharAt(inputStringLength - 1 - i, tempChar);
        }

        return reversedString.toString();
    }


    // Reverses the portion of the string that falls inclusively between the startIndex and the endIndex
    public String reversePartOfString(String inputString, int startIndex, int endIndex) {
        StringBuilder reversedString = new StringBuilder(inputString);
        char tempChar;
        int partLength = (endIndex - startIndex) + 1; // adding one makes it inclusive of the end index

        for (int i = 0; i < partLength / 2; i++) {
            tempChar = reversedString.charAt(i + startIndex);

            int secondIndex = endIndex - i;
            reversedString.setCharAt(startIndex + i, reversedString.charAt(secondIndex));
            reversedString.setCharAt(secondIndex, tempChar);
        }

        return reversedString.toString();
    }


    // Reverses the portion of the string that falls inclusively between the startIndex and the endIndex
    // This method takes a StringBuilder and operates on it in place and is expected to be used as a side-effect
    // function; it returns a String for ease of unit testing
    public String reversePartOfStringBuilder(StringBuilder inputStringBuilder, int startIndex, int endIndex) {
       // StringBuilder reversedString = new StringBuilder(inputString);
        char tempChar;
        int partLength = (endIndex - startIndex) + 1; // adding one makes it inclusive of the end index

        for (int i = 0; i < partLength / 2; i++) {
            tempChar = inputStringBuilder.charAt(i + startIndex);

            int secondIndex = endIndex - i;
            inputStringBuilder.setCharAt(startIndex + i, inputStringBuilder.charAt(secondIndex));
            inputStringBuilder.setCharAt(secondIndex, tempChar);
        }

        return inputStringBuilder.toString();
    }


    public String reverseWordsInSentence(String inputSentence) {
        logger.info("Start reverseWordsInSentence, inputSentence = \"" + inputSentence + "\"");
        long startTime = System.nanoTime();
        String[] wordsArray = inputSentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = 0; i < wordsArray.length; i++) {
            String thisWord = wordsArray[i];
            String thisWordReversed = reverseString(thisWord);

            reversedSentence.append(thisWordReversed + " ");
        }

        String outputSentence = reverseString(reversedSentence.toString()).trim();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        logger.info("End reverseWordsInSentence, outputSentence = \"" + outputSentence + "\"");
        logger.info("Time to run: " + duration + "\n");
        return outputSentence;
    }


    public String reverseWordsInSentenceUsingArray(String inputSentence) {
        logger.info("Start reverseWordsInSentenceUsingArray, inputSentence = \"" + inputSentence + "\"");
        long startTime = System.nanoTime();
        String[] wordsArray = inputSentence.split(" ");
        String[] reversedWordsArray = new String[wordsArray.length];
        int wordsArrayLength = wordsArray.length;

        StringBuilder reversedSentence = new StringBuilder();

        for (int i = wordsArray.length; i > 0; i--) {
            String thisWord = wordsArray[i - 1];
            reversedSentence.append(thisWord + " ");
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        String outputSentence = reversedSentence.toString().trim();
        logger.info("End reverseWordsInSentenceUsingArray, outputSentence = \"" + outputSentence + "\"");
        logger.info("Time to run: " + duration + "\n");
        return outputSentence;
    }


    public String reverseWordsInSentenceInPlace(String inputSentence) {
        logger.info("Start reverseWordsInSentenceInPlace, inputSentence = \"" + inputSentence + "\"");
        long startTime = System.nanoTime();

        StringBuilder reversedSentence = new StringBuilder(inputSentence);
        int startWord = 0;
        int endWord = -1;

        for (int i = 0; i < reversedSentence.length(); i++) {
            if (i == reversedSentence.length() - 1) {
                endWord = i;
            } else if (reversedSentence.charAt(i) == ' ') {
                endWord = i - 1;
            }

            if (endWord != -1) {
                reversePartOfStringBuilder(reversedSentence, startWord, endWord);
                startWord = endWord + 2;
                endWord = -1;
            }
        }

        // At this point the words are reversed in place; now reverse the entire input String to get the
        // sentence with the words in reverse order
        reversePartOfStringBuilder(reversedSentence, 0, reversedSentence.length() - 1);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        String outputSentence = reversedSentence.toString().trim();
        logger.info("End reverseWordsInSentenceInPlace, outputSentence = \"" + outputSentence + "\"");
        logger.info("Time to run: " + duration + "\n");
        return outputSentence;
    }

}
