package com.leetcode.base.int_inversion;

import java.util.Stack;

/**
 * 整数反转
 * @author cwh
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(reverse(-230));
	}
	
	public static int reverse(int x){
		String s = String.valueOf(x);
		boolean isMinus = false;
		if(x<0){
			s = String.valueOf(-x);
			isMinus = true;
		}
		Stack<String> stack = new Stack<String>();
		for(int i=0; i<s.length(); i++){
			String val = s.substring(i, i+1);
			if(!(i==s.length()-1 && val.equals("0"))){
				stack.push(val);				
			}
		}
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		int result = Integer.parseInt(sb.toString());
		return isMinus ? -result : result;
	}
}
