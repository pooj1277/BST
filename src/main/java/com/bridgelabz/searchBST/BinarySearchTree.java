package com.bridgelabz.searchBST;

public class BinarySearchTree<T extends Comparable<T>> {
	public static void main(String[] args) {
		System.out.println("Welcome to BinarySearchTree program");
		BinarySearchTree<Integer> binaryTree = new BinarySearchTree<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		binaryTree.add(65);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(63);
		binaryTree.add(67);
		int size = binaryTree.getSize();

		System.out.println("size of binary tree : " + size);

		binaryTree.searchNode(binaryTree.root, 63);

		if (flag)
			System.out.println("Element 63 is not present in the binary tree");
		else
			System.out.println("Element 63 is present in the binary tree");
	}

	BinaryNode<T> root;
	static boolean flag = false;

	public BinarySearchTree() {
		root = null;
	}

	public void add(T key) {
		this.root = this.insertData(root, key);
	}

	/**
	 * insert Node in Binary Search Tree
	 */
	public BinaryNode<T> insertData(BinaryNode<T> current, T key) {
		if (current == null)
			return new BinaryNode<T>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = insertData(current.left, key);
		} else {
			current.right = insertData(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeBinary(root);
	}

	public int getSizeBinary(BinaryNode<T> current) {
		return current == null ? 0 : 1 + this.getSizeBinary(current.left) + this.getSizeBinary(current.right);
	}

	/**
	 * Method for tree is empty or not 
	 */
	public void inorderTraversal(BinaryNode node) {
		if (root == null)
			System.out.println("Tree is empty");
		else {
			if (node.left != null)
				inorderTraversal(node.left);
			System.out.print(node.key + " ");
			if (node.right != null)
				inorderTraversal(node.right);
		}
	}

	/**
	 * search the whole tree for given element 
	 */
	public void searchNode(BinaryNode node, int value) {
		if (root == null)
			System.out.println("Tree is empty");
		else {
			if (node.key.compareTo(root.key) == value) {
				flag = true;
				return;
			}
			if (flag == false && node.left != null) {
				searchNode(node.left, value);
			}
			if (flag == false && node.right != null) {
				searchNode(node.right, value);
			}
		}
	}
}
