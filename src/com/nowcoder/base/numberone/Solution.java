package com.nowcoder.base.numberone;

/**
 * ��Ŀ����
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 * 
 * @author cwh
 *
 */
public class Solution {
	
	 public static void main(String[] args) {
        //ʹ��n=10,��������ʽΪ1010����1�ĸ���Ϊ2��
        int n = -10;
        System.out.println(n + "�Ķ�������1�ĸ�����" + NumberOf1(n));
    }
	
	
	 //---------------����--------------------------------
	 //˼�룺��1��1�����������㣬��ʵ�����Ͳ���1�ˣ���n��ÿλ����λ�룬���ж�1�ĸ���
    private static int NumberOf1_low(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }
    
    
    //--------------------���Ž�----------------------------
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }
}
