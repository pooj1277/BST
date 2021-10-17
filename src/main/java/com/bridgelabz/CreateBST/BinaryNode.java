package com.bridgelabz.day15.CreateBST;

public class BinaryNode <T extends Comparable<T>> {
    T key;
    BinaryNode<T> left;
    BinaryNode<T> right;

    public BinaryNode(T key)
    {
        super();
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "BinaryNode{" + "key=" + key + ", left-" + left + ", right-" + right + '}';
    }
}