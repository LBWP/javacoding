package org.javacoding.util;

/**
 * Created by laura on 2/18/14.
 */
public class TrNode {

    TrNode left;
    TrNode right;
    Object value;

    public TrNode(Object newValue, TrNode newLeft, TrNode newRight) {
        value = newValue;
        left = newLeft;
        right = newRight;
    }

    public void setLeft(TrNode newLeft) {
        left = newLeft;
    }

    public void setRight(TrNode newRight) {
        right = newRight;
    }

    public void setValue(Object newValue) {
        value = newValue;
    }

    public TrNode getLeft() {
        return left;
    }

    public TrNode getRight() {
        return right;
    }

    public Object getValue() {
        return value;
    }

}
