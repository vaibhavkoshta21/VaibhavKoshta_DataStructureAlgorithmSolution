package com.greatlearning.main;

public class bst {
	static class Node {
		 int rootData;
		 Node left, right;
		 Node(int key)
		 {
		     rootData = key;
		     left = null;
		     right = null;
		 }
		};
	static Node node;
	static Node prevNode = null;
	static Node headNode = null;
	static void Skewed(Node root) {
		if(root == null) {
			return;
		}
		Skewed(root.left);
		if(headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		Skewed(root.right);
	}

	static void RightSkewed(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.rootData + " ");
		RightSkewed(root.right);       
	}

	public static void main(String[] args) {
		bst tree = new bst();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		Skewed(node);
		RightSkewed(headNode);

	}

}
