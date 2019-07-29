package com.nowcoder.base.arrayquery;
/**
 * 
 * @author cwh
 * ��Ŀ����
 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */
public class Solution {
	public static void main(String[] args) {
		int target = 15;
		int[][] array = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 },
				{ 6, 8, 11, 15 } };
		// System.out.println(new Solution().Find(target, array));
		System.out.println(new Solution().matrixFind(target, array));
	}

	/**
	 * �����Ա�
	 * 
	 * @param target
	 * @param array
	 * @return
	 */
	public boolean Find(int target, int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == target) {
					return true;
				}
			}
		}
		return false;
	}

	  /*
     *  ˼·
	* ����������ģ������½��������������ֵݼ����������ֵ�����
	* ��˴����½ǿ�ʼ���ң���Ҫ�������ֱ����½����ִ�ʱ������
	* Ҫ�������ֱ����½�����Сʱ������
	*/
	public boolean matrixFind(int target, int[][] array) {
		int rowCount = array.length;
		int colCount = array[0].length;
		int i, j;
		for (i = rowCount - 1, j = 0; i >= 0 && j < colCount;) {
			if (target == array[i][j]) {
				return true;
			} else if (target < array[i][j]) {
				i--;
				continue;
			} else if (target > array[i][j]) {
				j++;
				continue;
			}
		}
		return false;
	}

}