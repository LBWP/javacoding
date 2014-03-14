package org.javacoding;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by laura on 3/6/14.
 */
public class ParenthesesMatch {
    Logger logger = Logger.getLogger(ParenthesesMatch.class);

    // Return a boolean indicating whether the (), [], {}, and <> pairs match
    // in the input string
    public boolean doParenthesesMatch(String stringWithParens) {

        StringBuilder stringBuilderWithParens = new StringBuilder(stringWithParens);
        Stack<Character> parensStack = new Stack<Character>();

        // Look at each character in the string and individually handle
        // all of the parentheses characters
        for (int i = 0; i < stringBuilderWithParens.length(); i++) {
            char thisChar = stringBuilderWithParens.charAt(i);
            switch (thisChar) {
                case '(':
                    parensStack.push(thisChar);
                    break;
                case ')':
                    if (parensStack.empty() || parensStack.peek() != '(') {
                        return false;
                    } else {
                        parensStack.pop();
                    }
                    break;
                case '[':
                    parensStack.push(thisChar);
                    break;
                case ']':
                    if (parensStack.empty() || parensStack.peek() != '[') {
                        return false;
                    } else {
                        parensStack.pop();
                    }
                    break;
                case '{':
                    parensStack.push(thisChar);
                    break;
                case '}':
                    if (parensStack.empty() || parensStack.peek() != '{') {
                        return false;
                    } else {
                        parensStack.pop();
                    }
                    break;
                case '<':
                    parensStack.push(thisChar);
                    break;
                case '>':
                    if (parensStack.empty() || parensStack.peek() != '<') {
                        return false;
                    } else {
                        parensStack.pop();
                    }
                    break;
            }
        }

        if (!parensStack.empty()) {
            return false;
        }

        return true;
    }

    // Return a boolean indicating whether the pairs of parens passed in in parenPairsArray match
    // in the input string
    // The matching pairs in the parenPairsArray argument must be ordered with the "open" character at an
    // even index and the matching "close" at the following odd index
    public boolean doInputParenthesesMatch(ArrayList<Character> parenPairsArray, String stringWithParens) {

        StringBuilder stringBuilderWithParens = new StringBuilder(stringWithParens);
        Stack<Character> parensStack = new Stack<Character>();

        // Look at each character in the string and individually handle
        // all of the parentheses characters
        for (int i = 0; i < stringBuilderWithParens.length(); i++) {
            Character thisChar = stringBuilderWithParens.charAt(i);

            for (int j = 0; j < parenPairsArray.size(); j++) {
                if ((j % 2 == 0) && thisChar.equals(parenPairsArray.get(j))) {
                    parensStack.push(thisChar);
                } else if ((j % 2 == 1) && thisChar.equals(parenPairsArray.get(j))) {
                    if (parensStack.empty() || parensStack.peek() != parenPairsArray.get(j-1)) {
                        return false;
                    } else {
                        parensStack.pop();
                    }
                }
            }
        }

        if (!parensStack.empty()) {
            return false;
        }

        return true;
    }

}
