package com.bridgelabz.day15.CreateBST;

public class BinarySearchTree <T extends Comparable<T>>{
    public static void main(String[] args) {
        BinarySearchTree<Integer> binaryTree = new BinarySearchTree<Integer>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);

        System.out.println(binaryTree);
    }
    private BinaryNode<T> root;

    public void add(T key)
    {
        this.root = this.insertData(root,key);
    }

    public BinaryNode<T> insertData(BinaryNode<T> current, T key)
    {
        if(current ==  null)
            return new BinaryNode<T>(key);
        int compareResult = key.compareTo(current.key);

        if(compareResult==0)
            return current;

        if(compareResult<0)
        {
            current.left = insertData(current.left, key);
        }
        else
        {
            current.right = insertData(current.right, key);
        }
        return current;
    }
    @Override
    public String toString()
    {
        return "MyBinary [root-" + root + "]";
    }
}