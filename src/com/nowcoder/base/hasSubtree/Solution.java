package com.nowcoder.base.hasSubtree;

/**
 * ��Ŀ���� �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * 
 * @author cwh
 * 
 */
public class Solution {
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if (root1 == null || root2 == null) {
			return false;
		}
		boolean result = false;
		// ����ҵ��˶�ӦTree2�ĸ��ڵ�ĵ�
		if (root1.val == root2.val) {
			// ��������ڵ�ΪΪ����ж��Ƿ����Tree2
			result = doesTree1HaveTree2(root1, root2);
		}
		// ����Ҳ�������ô����ȥroot������ӵ�����㣬ȥ�ж�ʱ�����Tree2
		if (!result) {
			result = HasSubtree(root1.left, root2);
		}

		// ������Ҳ�������ô����ȥroot���Ҷ��ӵ�����㣬ȥ�ж�ʱ�����Tree2
		if (!result) {
			result = HasSubtree(root1.right, root2);
		}
		return false;
	}

	private boolean doesTree1HaveTree2(TreeNode node1, TreeNode node2) {
		// ���Tree2�Ѿ��������˶��ܶ�Ӧ���ϣ�����true
		if (node2 == null) {
			return true;
		}
		// ���Tree2��û�б����꣬Tree1ȴ�������ˡ�����false
		if (node1 == null) {
			return false;
		}
		// ���������һ����û�ж�Ӧ�ϣ�����false
		if (node1.val != node2.val) {
			return false;
		}
		// ������ڵ��Ӧ���ϣ���ô�ͷֱ�ȥ�ӽڵ�����ƥ��
		return doesTree1HaveTree2(node1.left, node2.left)
				&& doesTree1HaveTree2(node1.right, node2.right);
	}
}
