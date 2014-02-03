package org.javacoding;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.Assert;

/**
* Created with IntelliJ IDEA.
* User: laura
* Date: 1/30/14
* Time: 9:04 AM
* To change this template use File | Settings | File Templates.
*/
public class ReverseWordsTest {
    private final Logger logger = Logger.getLogger(ReverseWordsTest.class);

    @Test
    public void testReverseString() throws Exception {
        ReverseWords tester = new ReverseWords();

        Assert.assertEquals("edcba", tester.reverseString("abcde"));

        Assert.assertEquals("fedcba", tester.reverseString("abcdef"));

        Assert.assertEquals("!ydnac ekil I", tester.reverseString("I like candy!"));
    }


    @Test
    public void testReversePartOfString() throws Exception {
        ReverseWords tester = new ReverseWords();

        Assert.assertEquals("fedcba", tester.reversePartOfString("abcdef", 0, 5));

        Assert.assertEquals("andosren", tester.reversePartOfString("anderson", 3, 6));

        Assert.assertEquals("I ekil candy!", tester.reversePartOfString("I like candy!", 2, 5));

        Assert.assertEquals("I like !ydnac", tester.reversePartOfString("I like candy!", 7, 12));
    }


    @Test
    public void testReversePartOfStringBuilder() throws Exception {
        ReverseWords tester = new ReverseWords();

        Assert.assertEquals("fedcba", tester.reversePartOfStringBuilder(new StringBuilder("abcdef"), 0, 5));

        Assert.assertEquals("patsreton", tester.reversePartOfStringBuilder(new StringBuilder("patterson"), 3, 6));

        Assert.assertEquals("I ekil candy!", tester.reversePartOfStringBuilder(new StringBuilder("I like candy!"), 2, 5));

        Assert.assertEquals("I like !ydnac", tester.reversePartOfStringBuilder(new StringBuilder("I like candy!"), 7, 12));
    }


    @Test
    public void testReverseWordsInSentence() throws Exception {
        ReverseWords tester = new ReverseWords();
        logger.info("\nIn testReverseWordsInSentence");

        Assert.assertEquals("dad. Hi", tester.reverseWordsInSentence("Hi dad."));
        Assert.assertEquals("mom. Hi", tester.reverseWordsInSentence("Hi mom."));
        Assert.assertEquals("dad. and  mom Hi", tester.reverseWordsInSentence("Hi mom  and dad."));
        Assert.assertEquals("sentence. a is This", tester.reverseWordsInSentence("This is a sentence."));
        Assert.assertEquals("hound? the and - fox the about what But", tester.reverseWordsInSentence("But what about the fox - and the hound?"));
        Assert.assertEquals("dog. lazy the over jumped fox brown quick The", tester.reverseWordsInSentence("The quick brown fox jumped over the lazy dog."));
        Assert.assertEquals("case. the is that hope I least at or margin, notable a by faster is it that show should array the uses that method the long very is sentence the When", tester.reverseWordsInSentence("When the sentence is very long the method that uses the array should show that it is faster by a notable margin, or at least I hope that is the case."));

        logger.info("End testReverseWordsInSentence\n");
    }


    @Test
    public void testReverseWordsInSentenceUsingArray() throws Exception {
        ReverseWords tester = new ReverseWords();
        logger.info("\nIn testReverseWordsInSentenceUsingArray");
        Assert.assertEquals("mom. Hi", tester.reverseWordsInSentenceUsingArray("Hi mom."));
        Assert.assertEquals("dad. Hi", tester.reverseWordsInSentenceUsingArray("Hi dad."));
        Assert.assertEquals("dad. and  mom Hi", tester.reverseWordsInSentenceUsingArray("Hi mom  and dad."));
        Assert.assertEquals("sentence. a is This", tester.reverseWordsInSentenceUsingArray("This is a sentence."));
        Assert.assertEquals("hound? the and - fox the about what But", tester.reverseWordsInSentenceUsingArray("But what about the fox - and the hound?"));
        Assert.assertEquals("dog. lazy the over jumped fox brown quick The", tester.reverseWordsInSentence("The quick brown fox jumped over the lazy dog."));
        Assert.assertEquals("case. the is that hope I least at or margin, notable a by faster is it that show should array the uses that method the long very is sentence the When", tester.reverseWordsInSentence("When the sentence is very long the method that uses the array should show that it is faster by a notable margin, or at least I hope that is the case."));

        logger.info("End testReverseWordsInSentenceUsingArray\n");
    }


     @Test
    public void testReverseWordsInSentenceInPlace() throws Exception {
        ReverseWords tester = new ReverseWords();
        logger.info("\nIn testReverseWordsInSentenceInPlace");
        Assert.assertEquals("mom. Hi", tester.reverseWordsInSentenceInPlace("Hi mom."));
        Assert.assertEquals("dad. Hi", tester.reverseWordsInSentenceInPlace("Hi dad."));
        Assert.assertEquals("dad. and  mom Hi", tester.reverseWordsInSentenceInPlace("Hi mom  and dad."));
         Assert.assertEquals("sentence. a is This", tester.reverseWordsInSentenceInPlace("This is a sentence."));
        Assert.assertEquals("hound? the and - fox the about what But", tester.reverseWordsInSentenceInPlace("But what about the fox - and the hound?"));
        Assert.assertEquals("dog. lazy the over jumped fox brown quick The", tester.reverseWordsInSentenceInPlace("The quick brown fox jumped over the lazy dog."));
        Assert.assertEquals("case. the is that hope I least at or margin, notable a by faster is it that show should array the uses that method the long very is sentence the When", tester.reverseWordsInSentenceInPlace("When the sentence is very long the method that uses the array should show that it is faster by a notable margin, or at least I hope that is the case."));

         logger.info("End testReverseWordsInSentenceInPlace\n");
    }

}
