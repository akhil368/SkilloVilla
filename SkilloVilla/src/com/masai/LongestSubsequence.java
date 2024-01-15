package com.masai;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestSubsequence {

	public static void main(String[] args) {
		int[] input1 = {6, 7, 3, 1, 100, 102, 6, 12};
		longest(input1);
	}
	
	public static void longest(int[] arr)
	{
		HashSet<Integer> set=new HashSet<>();
		
		for(int num:arr)
		{
			set.add(num);
		}
		int longest=0;
		List<Integer> list=new ArrayList<>();
		for(int num:arr)
		{
			if(!set.contains(num-1))
			{
				int currNum=num;
				int currLength=1;
				while(set.contains(currNum+1))
				{
					currNum++;
					
					currLength++;
				}
				if(currLength>longest)
				{
					longest=currLength;
					for(int i=num;i<=currNum;i++)
					{
						list.add(i);
					}
				}
			}
		}
		System.out.println("(" + longest +", "+ list + ")");
	}
}
