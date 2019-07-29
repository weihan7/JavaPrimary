package com.nowcoder.base.linked_list;

import java.util.ArrayList;

/**
 * 
 * @author cwh
 * ��Ŀ����
 * ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
 */
public class Solution {
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
//		new Solution().printListFromTailToHead(node1);
		new Solution().printListFromTailToHead2(node1);
	}
	
	//����һ
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            this.printListFromTailToHead(listNode.next);
            System.out.println(listNode.val);
            arrayList.add(listNode.val);
        }
       return arrayList;
    }
	/**
	 * �ݹ�ĵ���printListFromTailToHaed(listNode.next)����ڵ㣬��ô�����һ�εݹ鷽�������Ժ�
	 * ÿһ��ĵݹ鷽��������һ��arrayList.add(lizxstNode.val)��������������һ�ε���һ�Σ�����ĵ����˺���ķ�����
	 * ��Ϊ֮ǰ�ĵݹ���Ѿ������ˡ������ջ��ģ�Ϳ�����
	 */
	
	
	//������	
	public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		ListNode pNode=listNode;
		if(pNode!=null){
		    if(pNode.next!=null){
		        list=printListFromTailToHead2(pNode.next);
		    }
		    System.out.println(pNode.val);
		    list.add(pNode.val);
		}
		
		return list;
	}
	/**
	 * ���ַ������ǵݹ����ջ��˼�룬��ͬ���Ǽ��ϱ����Ļ�ȡ��ʽ
	 */
}