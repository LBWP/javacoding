package org.javacoding;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by laura on 2/11/14.
 */
public class FibonacciTest {

    @Test
    public void findNthFibTest() throws Exception {
        Fibonacci tester = new Fibonacci();
        Assert.assertEquals(0, tester.findNthFib(0));
        Assert.assertEquals(1, tester.findNthFib(1));
        Assert.assertEquals(1, tester.findNthFib(2));
        Assert.assertEquals(2, tester.findNthFib(3));
        Assert.assertEquals(3, tester.findNthFib(4));
        Assert.assertEquals(5, tester.findNthFib(5));
        Assert.assertEquals(8, tester.findNthFib(6));
        Assert.assertEquals(13, tester.findNthFib(7));
        Assert.assertEquals(21, tester.findNthFib(8));
        Assert.assertEquals(34, tester.findNthFib(9));
        Assert.assertEquals(701408733, tester.findNthFib(44));

    }




}
