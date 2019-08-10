package com.leetcode.base.two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * @author cwh
 *
 *如果出现{2,2,3,4,5}这样的数组，以下解法会有问题。
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
			if(map.get(gap) !=null && (int)map.get(gap)!=i){//确保第二个索引存在，且不是自己
				res[0] = i;
				res[1] = (int)map.get(gap);
				break;
			}
		}
		return res;
	}
}
