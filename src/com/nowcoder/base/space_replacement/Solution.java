package com.nowcoder.base.space_replacement;

/**
 * 
 * @author cwh
 * 题目描述
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
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
