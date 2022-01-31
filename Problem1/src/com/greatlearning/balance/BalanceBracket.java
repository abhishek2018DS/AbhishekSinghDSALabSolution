package com.greatlearning.balance;
import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket {
	public static boolean isBalanced(String bracketsExpression)
	{
		Stack<Character> stack= new Stack<>();
		for (int i=0; i<bracketsExpression.length(); i++)
		{
			char ch= bracketsExpression.charAt(i);
			if(ch== '('||ch=='['||ch== '{') 
			{
				stack.push(ch);
				continue;
			}
			if(stack.isEmpty())
			{
				return false;
			}
			char c;
			switch(ch)
			{
			case '}':
				c= stack.pop();
				if(c=='('||c=='[')
					return false;
				break;
			
			case ')':
				c= stack.pop();
				if(c=='{'|| c=='[')
					return false;
				break;
				
			case ']':
				c= stack.pop();
				if(c=='c'||c=='{')
					return false;
				break;
			
			}
		}
		return stack.isEmpty();
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the bracket string: ");
		String bracketsExpression= sc.nextLine();
		if (isBalanced(bracketsExpression))
		{
			System.out.println("Given Bracket String is balanced");
		}
		else
		{
			System.out.println("Given Bracket String is unbalanced");
			
		}
	}

}
