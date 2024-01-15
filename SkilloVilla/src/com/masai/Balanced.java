package com.masai;

import java.util.Stack;

public class Balanced {

	public static void main(String[] args) {
		
		String str= "(coder)(byte))";
		System.out.println(para(str));
	}
	public static int para(String str)
	{
		Stack<Character > stack=new Stack<>();
		for(char ch:str.toCharArray())
		{
			if(ch=='(' || ch=='{' || ch=='[')
			{
				stack.push(ch);
			}
			else {
				if(stack.isEmpty())
				{
					return 0;
				}
				char top=stack.pop();
				if(ch==')' && top=='('
					|| ch=='}' && top =='{' ||
					ch==']' && top==']'
					)
					return 0;
					
				}
			}
		return stack.isEmpty()? 1:0;
		}
	}

