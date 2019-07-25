package com.nowcoder.base.space_replacement;

public class Solution {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("We Are Happy");
		new Solution().replaceSpace(sb);
	}
	
	 public String replaceSpace(StringBuffer str) {
	        String string = str.toString();
	        return string.replaceAll(" ", "%20");
//	        return str.toString().replaceAll(" ", "%20");
	 }

}
