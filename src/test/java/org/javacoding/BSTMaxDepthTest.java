package org.javacoding;

import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.javacoding.util.TrNode;
import org.junit.Test;

/**
 * Created by laura on 2/18/14.
 */
public class BSTMaxDepthTest {
    Logger logger = Logger.getLogger(BSTMaxDepthTest.class);

    @Test
    public void maxDepthOfTreeTest() throws Exception {
        BSTMaxDepth tester = new BSTMaxDepth();
        TrNode four = new TrNode(4, null, null);
        TrNode seven = new TrNode(7, null, null);
        TrNode thirteen = new TrNode(13, null, null);
        TrNode one = new TrNode(1, null, null);
        TrNode six = new TrNode(6, four, seven);
        TrNode fourteen = new TrNode(14, thirteen, null);
        TrNode ten = new TrNode(10, null, fourteen);
        TrNode three = new TrNode(3, one, six);
        TrNode bstRoot = new TrNode(8, three, ten);

        Assert.assertEquals(4, tester.maxDepthOfTree(bstRoot));

        TrNode bstRoot2 = new TrNode(8, null, null);
        Assert.assertEquals(1, tester.maxDepthOfTree(bstRoot2));

        TrNode bstRoot3 = new TrNode(8, new TrNode(3, null, null), null);
        Assert.assertEquals(2, tester.maxDepthOfTree(bstRoot3));

        TrNode bstRoot4 = new TrNode(8, new TrNode(3, one, null), null);
        Assert.assertEquals(3, tester.maxDepthOfTree(bstRoot4));

        TrNode bstRoot5 = new TrNode(8, new TrNode(3, one, null), thirteen);
        Assert.assertEquals(3, tester.maxDepthOfTree(bstRoot5));

        TrNode nine = new TrNode(9, null, null);
        TrNode eleven = new TrNode(11, nine, null);
        TrNode bstRoot6 = new TrNode(8, new TrNode(3, one, null), new TrNode(13, eleven, null));
        Assert.assertEquals(4, tester.maxDepthOfTree(bstRoot6));

        thirteen.setLeft(eleven);
        Assert.assertEquals(6, tester.maxDepthOfTree(bstRoot));

    }
}
