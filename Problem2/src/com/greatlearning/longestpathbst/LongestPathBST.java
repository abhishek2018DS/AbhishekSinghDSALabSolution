package com.greatlearning.longestpathbst;
import java.util.ArrayList;

public class LongestPathBST {
	
	static class Node
	{
		Node left;
		Node right;
		int data;		
	}
	static Node newNode(int data)
	{
		Node tmp= new Node();
		tmp.data= data;
		tmp.left = null;
		tmp.right= null;
		return tmp;
	}
	public static ArrayList<Integer> longestPath(Node root)
	{
		if (root==null)
		{
			ArrayList<Integer> output= new ArrayList<>();
			return output;
		}
		
		ArrayList<Integer>left= longestPath(root.left);
		ArrayList<Integer>right=longestPath(root.right);
		
		if(right.size()<left.size())
			{
			
			left.add(root.data);
			}
		else
		{
			right.add(root.data);
		}
		return left.size()> right.size()?left:right;
		
	}
	
	public static void main(String [] args)
	{
		Node root= newNode(100);
		root.left= newNode(20);
		root.right= newNode(130);
		root.left.left= newNode(10);
		root.left.right= newNode(50);
		root.right.left=  newNode(110);
		root.right.right= newNode(140);
		root.left.left.left= newNode(5);
		
		ArrayList<Integer>output= longestPath(root);
		//System.out.println("output: "+output);
		int n= output.size();
		System.out.print("Longest path is ");
		for(int i = n-1; i>=0; i--) {
			System.out.print("->"+output.get(i));
			}
	}
}
