package com.nowcoder.base.step_jumping;

/**
 * ��Ŀ��
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
 * @author cwh
 *
 */
public class Solution {
	/**
	 * ���ڱ���,ǰ��ֻ�� һ�� 1�׻���2�׵�������
	 *  a.�������������1�׻���2�ף���ô�ٶ���һ��������һ�ף���ôʣ�µ���n-1��̨�ף�������f(n-1);
	 * b.�ٶ���һ��������2�ף���ôʣ�µ���n-2��̨�ף�������f(n-2)
	 * c.��a\b������Եó�������Ϊ: f(n) = f(n-1) + f(n-2) 
	 * d.Ȼ��ͨ��ʵ�ʵ�������Եó���ֻ��һ�׵�ʱ�� f(1) = 1 ,ֻ�����׵�ʱ������� f(2) = 2
	 * e.���Է������յó�����һ��쳲��������У�
	 * @param target
	 * @return
	 */
	public int JumpFloor(int target) {
		if (target <= 0) {
			return -1;
		} else if (target == 1) {
			return 1;
		} else if (target == 2) {
			return 2;
		} else {
			return JumpFloor(target - 1) + JumpFloor(target - 2);
		}
	}
}
