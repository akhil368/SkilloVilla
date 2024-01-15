package com.masai;

public class EnhancedCompare {

	public static void main(String[] args) {
		String[] input= {"10011", "10100"};
		System.out.println(enhance(input));
	}
	public static int enhance(String [] str)
	{
		String str1=str[0];
		String str2=str[1];
		
		int length=0;
		for(int i=0;i<str1.length();i++)
		{
			char c1=str1.charAt(i);
			char c2=str2.charAt(i);
			length+=Math.abs(c1-c2);
		}
		return length;
	}
}
