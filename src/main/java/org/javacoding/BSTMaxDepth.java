package org.javacoding;

import org.apache.log4j.Logger;
import org.javacoding.util.TrNode;

/**
 * Created by laura on 2/18/14.
 */
public class BSTMaxDepth {
    Logger logger = Logger.getLogger(BSTMaxDepth.class);

    public int maxDepthOfTree(TrNode bstRoot) {
        int leftDepth = 1;
        int rightDepth = 1;

        // Traverse left sub-tree, incrementing leftDepth each time the
        // function is called recursively; the end value of leftDepth
        // includes the depth added by the current node
        if (bstRoot.getLeft() != null) {
            leftDepth = 1 + maxDepthOfTree(bstRoot.getLeft());
        }

        // Visit the current node
        logger.info(bstRoot.getValue().toString());

        // Traverse right sub-tree, incrementing rightDepth each time the
        // function is called recursively; the end value of rightDepth
        // includes the depth added by the current node
        if (bstRoot.getRight() != null) {
            rightDepth = 1 + maxDepthOfTree(bstRoot.getRight());
        }

        // Return whichever is greater of leftDepth and rightDepth
        return (leftDepth >= rightDepth ? leftDepth : rightDepth);
    }
}
