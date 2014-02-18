package org.javacoding;

import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by laura on 2/5/14.
 */
public class AnagramsTest {
    private final Logger logger = Logger.getLogger(AnagramsTest.class);

    @Test
    public void stringsAreAnagramsTest() throws Exception {
        Anagrams tester = new Anagrams();

        Assert.assertEquals(true, tester.stringsAreAnagrams("cat", "tac"));

        Assert.assertEquals(false, tester.stringsAreAnagrams("cat", "scat"));

        Assert.assertEquals(true, tester.stringsAreAnagrams("cat", "tca"));

        Assert.assertEquals(false, tester.stringsAreAnagrams("cat", "yo mama"));

        Assert.assertEquals(true, tester.stringsAreAnagrams("Vladimir Nabokov", "Vivian Bloodmark"));

        Assert.assertEquals(true, tester.stringsAreAnagrams("Clint Eastwood", "Old West Action"));

        Assert.assertEquals(false, tester.stringsAreAnagrams("Clint Eastwoods", "Old West Action"));

        Assert.assertEquals(false, tester.stringsAreAnagrams("Clint Eastwood", "Eastwood Cline"));

        Assert.assertEquals(true, tester.stringsAreAnagrams("PRESIDENT CLINTON OF THE USA", "TO COPULATE HE FINDS INTERNS"));

    }
}
