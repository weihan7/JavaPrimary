package com.nowcoder.base.step_jumping_abnormal;
/**
 * ��Ŀ����
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 *
 */
public class Solution {
	public static void main(String[] args) {
		new Solution().JumpFloorII(2);
	}
    public int JumpFloorII(int target) {
    	 if (target <= 0) return 0;
 		return (int) Math.pow(2, target - 1);
    }
}
