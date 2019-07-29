package com.nowcoder.base.numberone;

/**
 * 题目描述
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 
 * @author cwh
 *
 */
public class Solution {
	
	 public static void main(String[] args) {
        //使用n=10,二进制形式为1010，则1的个数为2；
        int n = -10;
        System.out.println(n + "的二进制中1的个数：" + NumberOf1(n));
    }
	
	
	 //---------------正解--------------------------------
	 //思想：用1（1自身左移运算，其实后来就不是1了）和n的每位进行位与，来判断1的个数
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
    
    
    //--------------------最优解----------------------------
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }
}
