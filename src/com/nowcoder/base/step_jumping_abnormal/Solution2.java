package com.nowcoder.base.step_jumping_abnormal;

public class Solution2 {
	public static void main(String[] args) {
		new Solution().JumpFloorII(2);
	}
	
	/**
	 * 
	 * ��λ�Ʋ������У�����
	 * 
	 * ����1λ���ǳ���һ��2����1����������target-1λ����1����2^(target-1)
	 * @param target
	 * @return
	 */
	public int JumpFloorII(int target) {
   	 	return 1<<(target-1);
   }
}
