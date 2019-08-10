package com.leetcode.base.two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * ����֮��
 * @author cwh
 *
 *�������{2,2,3,4,5}���������飬���½ⷨ�������⡣
 */
public class Solution {

	public int[] twoSum(int[] nums, int target) {
		if (nums.length < 2) {
			return null;
		}
		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int gap = target - nums[i];
			if(map.get(gap) !=null && (int)map.get(gap)!=i){//ȷ���ڶ����������ڣ��Ҳ����Լ�
				res[0] = i;
				res[1] = (int)map.get(gap);
				break;
			}
		}
		return res;
	}
}
