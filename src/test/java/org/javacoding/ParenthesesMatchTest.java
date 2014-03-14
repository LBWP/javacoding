package org.javacoding;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by laura on 3/6/14.
 */
public class ParenthesesMatchTest {

    @Test
    public void doParenthesesMatchTest() throws Exception {
        ParenthesesMatch tester = new ParenthesesMatch();
        Assert.assertEquals(false, tester.doParenthesesMatch("("));
        Assert.assertEquals(true, tester.doParenthesesMatch("()"));
        Assert.assertEquals(false, tester.doParenthesesMatch("(<)>"));
        Assert.assertEquals(false, tester.doParenthesesMatch("(]"));
        Assert.assertEquals(false, tester.doParenthesesMatch("]"));
        Assert.assertEquals(true, tester.doParenthesesMatch("(hi!)"));
        Assert.assertEquals(true, tester.doParenthesesMatch("(hi! {})"));
        Assert.assertEquals(false, tester.doParenthesesMatch("(hi! <{})"));
        Assert.assertEquals(true, tester.doParenthesesMatch("[say what?] (hi! <{}>)"));
        Assert.assertEquals(false, tester.doParenthesesMatch("[say what?] (hi! <{}>"));

        Assert.assertEquals(false, tester.doParenthesesMatch(" " +
            "public int findNthFib(int N) { " +
            " // Handle the base cases of 0 and 1 to return 0 and 1 respectively" +
            "   if (N == 0) { " +
            "        return 0;" +
            "   } else if (N == 1)" +
            "       return 1; " +
            "   } else { " +
            " // If N isn't 0 or 1, call this function recursively with " +
            " // (N - 1) and (N - 2) and add the values together " +
            "       return findNthFib(N - 1) + findNthFib(N - 2); " +
            "   } " +
            "} "));

        Assert.assertEquals(true, tester.doParenthesesMatch(" " +
            "public int findNthFib(int N) { " +
            " // Handle the base cases of 0 and 1 to return 0 and 1 respectively" +
            "   if (N == 0) { " +
            "        return 0;" +
            "   } else if (N == 1) {" +
            "       return 1; " +
            "   } else { " +
            " // If N isn't 0 or 1, call this function recursively with " +
            " // (N - 1) and (N - 2) and add the values together " +
            "       return findNthFib(N - 1) + findNthFib(N - 2); " +
            "   } " +
            "} "));


    }

    @Test
    public void doInputParenthesesMatch() throws Exception {
        ParenthesesMatch tester = new ParenthesesMatch();
        ArrayList<Character> justParens = new ArrayList<Character>();
        justParens.add('(');
        justParens.add(')');

        ArrayList<Character> parensAndCurlies = new ArrayList<Character>();
        parensAndCurlies.add('(');
        parensAndCurlies.add(')');
        parensAndCurlies.add('{');
        parensAndCurlies.add('}');

        ArrayList<Character> parensCurliesSquaresAndAngles = new ArrayList<Character>();
        parensCurliesSquaresAndAngles.add('(');
        parensCurliesSquaresAndAngles.add(')');
        parensCurliesSquaresAndAngles.add('{');
        parensCurliesSquaresAndAngles.add('}');
        parensCurliesSquaresAndAngles.add('[');
        parensCurliesSquaresAndAngles.add(']');
        parensCurliesSquaresAndAngles.add('<');
        parensCurliesSquaresAndAngles.add('>');



        Assert.assertEquals(false, tester.doInputParenthesesMatch(justParens, ("(")));
        Assert.assertEquals(true, tester.doInputParenthesesMatch(justParens, "()"));
        Assert.assertEquals(false, tester.doInputParenthesesMatch(parensCurliesSquaresAndAngles, "(<)>"));
        Assert.assertEquals(false, tester.doInputParenthesesMatch(parensCurliesSquaresAndAngles, "(]"));
        Assert.assertEquals(false, tester.doInputParenthesesMatch(parensCurliesSquaresAndAngles, "]"));
        Assert.assertEquals(true, tester.doInputParenthesesMatch(justParens, "(hi!)"));
        Assert.assertEquals(true, tester.doInputParenthesesMatch(parensAndCurlies, "(hi! {})"));
        Assert.assertEquals(false, tester.doInputParenthesesMatch(parensCurliesSquaresAndAngles, "(hi! <{})"));
        Assert.assertEquals(true, tester.doInputParenthesesMatch(parensCurliesSquaresAndAngles, "[say what?] (hi! <{}>)"));
        Assert.assertEquals(false, tester.doInputParenthesesMatch(parensCurliesSquaresAndAngles, "[say what?] (hi! <{}>"));

        Assert.assertEquals(false, tester.doInputParenthesesMatch(parensAndCurlies, " " +
                "public int findNthFib(int N) { " +
                " // Handle the base cases of 0 and 1 to return 0 and 1 respectively" +
                "   if (N == 0) { " +
                "        return 0;" +
                "   } else if (N == 1)" +
                "       return 1; " +
                "   } else { " +
                " // If N isn't 0 or 1, call this function recursively with " +
                " // (N - 1) and (N - 2) and add the values together " +
                "       return findNthFib(N - 1) + findNthFib(N - 2); " +
                "   } " +
                "} "));

        Assert.assertEquals(true, tester.doInputParenthesesMatch(parensAndCurlies, " " +
                "public int findNthFib(int N) { " +
                " // Handle the base cases of 0 and 1 to return 0 and 1 respectively" +
                "   if (N == 0) { " +
                "        return 0;" +
                "   } else if (N == 1) {" +
                "       return 1; " +
                "   } else { " +
                " // If N isn't 0 or 1, call this function recursively with " +
                " // (N - 1) and (N - 2) and add the values together " +
                "       return findNthFib(N - 1) + findNthFib(N - 2); " +
                "   } " +
                "} "));


    }

}
