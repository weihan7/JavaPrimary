package com.nowcoder.base.step_jumping_abnormal;

public class Solution2 {
	public static void main(String[] args) {
		new Solution().JumpFloorII(2);
	}
	
	/**
	 * 
	 * 用位移操作进行，更快
	 * 
	 * 左移1位就是乘以一个2，在1基础上左移target-1位就是1乘以2^(target-1)
	 * @param target
	 * @return
	 */
	public int JumpFloorII(int target) {
   	 	return 1<<(target-1);
   }
}
