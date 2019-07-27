package com.nowcoder.base.Fibonacci;

/**
 * 题目：
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 *
 */
public class Solution {
	
	public static void main(String[] args) {
//		System.out.println(new Solution().Fibonacci(1111139));
		System.out.println(new Solution().Fibonacci2(1111139));
	}
	
	
	//方法一  该方法存在问题：当数值较大时，会导致栈溢出
	public int Fibonacci(int n) {
        if(n==0 || n==1){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
	
	//方法二	用循环，最好不要用递归。因为测试用例里肯定准备着一个超大的n来让Stack Overflow
	public int Fibonacci2(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
        int preNum = 1;
        int prePreNum = 0;
        int result = 0;
        for(int i=2; i<=n; i++){
            result = preNum + prePreNum;
            prePreNum = preNum;
            preNum = result;
        }
        return result;
    }
	
	//方法三（与方法二思想一样）
	public int Fibonacci3(int n){
		if(n<=1){
		    return n;
		}
		int[] record = new int[n+1];
		record[0] = 0;
		record[1] = 1;
		for(int i=2; i<=n; i++){
		    record[i] = record[i-1] + record[i-2];
		}
		return record[n];
	}
	
	 
}
