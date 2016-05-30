package com.java.algorithm.binarytree;

import java.util.Stack;

/**
 * 二叉树遍历
 * 前（先）序遍历（DLR）：首先访问根结点，然后遍历左子树，最后遍历右子树。
 * 中序遍历（LDR）：首先遍历左子树，然后访问根结点，最后遍历右子树。
 * 后序遍历（LRD）：首先遍历左子树，然后遍历右子树，最后访问根节点。
 * @author zhongyao
 *
 */
public class BinTree {
	
	
	public static void main(String[] args) {
		
		BinTree tree = new BinTree(init());
		System.out.println("Pre-Order:");
		preorder(tree.getRoot());
		System.out.println();
		
		System.out.println("In-Order:");
		inorder(tree.getRoot());
		System.out.println();
		
		System.out.println("Post-Order:");
		postorder(tree.getRoot());
		System.out.println();
		
		System.out.println("iterative-Post-Order");
		iterativePreorder(tree.getRoot());
		System.out.println();
		
	}

	
	protected BTNode root;
	public BinTree(BTNode root){
		this.root = root;
	}
	
	public BTNode getRoot(){
		return root;
	}
	
	/**
	 * 构造树
	 */
	public static BTNode init(){
		BTNode a = new BTNode('A');
		BTNode b = new BTNode('B',null,a);
		BTNode c = new BTNode('C');
		BTNode d = new BTNode('D', b, c);
		BTNode e = new BTNode('E');
		BTNode f = new BTNode('F', e, null);
		BTNode g = new BTNode('G', null, f);
		BTNode h = new BTNode('H', d, g);
		return h;
	}
	
	/**
	 * 访问节点
	 */
	public static void visit(BTNode p){
		System.out.print(p.getKey()+" ");
	}
	
	/**
	 * 递归实现前序遍历
	 */
	protected static void preorder(BTNode p){
		if (p != null) {
			visit(p);
			preorder(p.getLeft());
			preorder(p.getRight());
			
		}
	}
	
	/**
	 * 递归实现中序遍历
	 */
	protected static void inorder(BTNode p){
		if (p != null) {
			inorder(p.getLeft());
			visit(p);
			inorder(p.getRight());
		}
	}
	
	/**
	 * 递归实现后序遍历
	 */
	
	protected static void postorder(BTNode p){
		if (p != null) {
			postorder(p.getLeft());
			postorder(p.getRight());
			visit(p);
		}
	}
	
	//============================================
	
	/**
	 * 非递归(迭代)实现先序遍历
	 */
	protected static void iterativePreorder(BTNode p){
		Stack<BTNode> stack = new Stack<BTNode>();
		if (p!=null) {
			stack.push(p);
			while (!stack.empty()) {
				p = stack.pop();
				visit(p);
				if (p.getRight() != null) {
					stack.push(p.getRight());
				}
				
				if (p.getLeft() != null) {
					stack.push(p.getLeft());
				}
				
			}
		}
	}
	
	/**
	 * 非递归实现中序遍历
	 */
	protected static void iterativeInoder(BTNode p){
		Stack<BTNode> stack = new Stack<BTNode>();
		
	}
}
