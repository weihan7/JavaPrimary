package com.nowcoder.base.Fibonacci;

/**
 * ��Ŀ��
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
 * n<=39
 *
 */
public class Solution {
	
	public static void main(String[] args) {
//		System.out.println(new Solution().Fibonacci(1111139));
		System.out.println(new Solution().Fibonacci2(1111139));
	}
	
	
	//����һ  �÷����������⣺����ֵ�ϴ�ʱ���ᵼ��ջ���
	public int Fibonacci(int n) {
        if(n==0 || n==1){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
	
	//������	��ѭ������ò�Ҫ�õݹ顣��Ϊ����������϶�׼����һ�������n����Stack Overflow
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
	
	//���������뷽����˼��һ����
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
