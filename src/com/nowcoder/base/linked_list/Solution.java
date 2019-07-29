package com.nowcoder.base.linked_list;

import java.util.ArrayList;

/**
 * 
 * @author cwh
 * 题目描述
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
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
	
	//方法一
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
	 * 递归的点在printListFromTailToHaed(listNode.next)这个节点，那么在最后一次递归方法返回以后，
	 * 每一层的递归方法都会做一个arrayList.add(lizxstNode.val)这个操作，从最后一次到第一次，逆向的调用了后面的方法。
	 * 因为之前的递归点已经返回了。这个用栈的模型考虑下
	 */
	
	
	//方法二	
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
	 * 两种方法都是递归调用栈的思想，不同的是集合变量的获取方式
	 */
}