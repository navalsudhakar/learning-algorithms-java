package practiceNew;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUseCase {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	static class BinaryTree {
		static int index = -1;

		public static Node buildTree(int[] nodes) {
			index++;

			if (nodes[index] == -1) {
				return null;
			}

			Node newNode = new Node(nodes[index]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}
		
		public static void preorder(Node root) {
			if(root==null) {
				return;
			}
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}

		public static void inorder(Node root) {
			if(root==null)
				return;
			
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
		public static void postOrder(Node root) {
			if(root==null)
				return;
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
		
//		public static void levelOrder(Node root) {
//			if (root == null) {
//				return;
//			}
//
//			Queue<Node> q = new LinkedList<>();
//			q.add(root);
//			q.add(null);
//
//			while (!q.isEmpty()) {
//				Node curr = q.remove();
//
//				if (curr == null) {
//					System.out.println();
//					if (q.isEmpty()) {
//						break;
//					} else {
//						q.add(null);
//
//					}
//
//				} else {
//
//					System.out.print(curr.data + " ");
//					if (curr.left != null) {
//						q.add(curr.left);
//					}
//					if (curr.right != null) {
//						q.add(curr.right);
//					}
//
//				}
//			}
//		}
		
		public static void levelOrder(Node root) {
			if (root == null) {
				return;
			}

			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);

			while (!q.isEmpty()) {
				Node curr = q.remove();
				if (curr == null) {
					System.out.println();
					if (q.isEmpty()) {
						break;
					} else {
						q.add(null);
					}
				} else {
					System.out.print(curr.data + " ");
					if (curr.left != null) {
						q.add(curr.left);
					}
					if (curr.right != null) {
						q.add(curr.right);
					}
				}
			}
		}
		
		public static int maxDepth(Node root) {
			if(root==null) {
				return -1;
			}
			
			int leftDepth=maxDepth(root.left);
			int rightDepth=maxDepth(root.right);
			
			return Math.max(leftDepth, rightDepth)+1;
		}
	}
	

	public static void main(String[] args) {
		int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Node root = BinaryTree.buildTree(nodes);
		//System.out.println(root.data);
		//BinaryTree.preorder(root);
		//BinaryTree.inorder(root);
		//BinaryTree.postOrder(root);
		//BinaryTree.levelOrder(root);
		
		System.out.println("***************************************");
		
		System.out.println(BinaryTree.maxDepth(root));

	}

}
