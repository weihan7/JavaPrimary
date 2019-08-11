package com.leetcode.base.two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * 
 * @author cwh
 * 
 */
public class Solution {

	// 方法一：两遍哈希表。 如果出现{2,2,3,4,5}这样的数组，该解法会有问题。
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
			if (map.get(gap) != null && (int) map.get(gap) != i) {// 确保第二个索引存在，且不是自己
				res[0] = i;
				res[1] = (int) map.get(gap);
				break;
			}
		}
		return res;
	}

	// 方法二：暴力法
	public int[] twoSum2(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
