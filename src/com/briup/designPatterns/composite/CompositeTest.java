package com.briup.designPatterns.composite;

public class CompositeTest {
	public static void main(String[] args) {
		Tree root = new Tree("a");
		TreeNode b = new TreeNode("b");
		TreeNode c = new TreeNode("c");
		b.addNode(c);
		root.getRoot().addNode(b);
	}
}
class TreeNode{
	private String name;
	public TreeNode(){}
	public TreeNode(String name){
		this.name = name;
	}
	public void addNode(TreeNode tn){
		System.out.println(name+" add "+tn.name);
	}
}
class Tree{
	private TreeNode root=null;
	public Tree(String name){
		root = new TreeNode(name);
	}
	public TreeNode getRoot(){
		return root;
	}
}