package com.nowcoder.base.linked_k_node;

import java.util.Stack;

/**
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author cwh
 *
 */
public class Solution {
	
	
	//时间复杂度，一次遍历即可
	public ListNode FindKthToTail(ListNode head, int k){
		ListNode pre=null, p=null;
		//两个指针都指向头节点
		p=head;
		pre=head;
		//记录k值
		int a=k;
		//记录节点的个数
		int count =0;
		//p指针先跑，并且记录节点数，当p指针跑了k-1个节点后，pre指针开始跑，
        //当p指针跑到最后时，pre所指指针就是倒数第k个节点
		while(p!=null){
			p = p.next;
			count++;
			if(k<1){
				pre=pre.next;
			}
			k--;
		}
		//如果节点个数小于所求的倒数第K个节点，则返回空
		if(count<a) return null;
		return pre;
	}


	//使用Stack，将节点压入栈中，再取出第k个就好
	public ListNode FindKthToTail2(ListNode head, int k){
		if(head == null || k == 0){
			return null;
		}
			
		//可以先把链表反转，然后找出第k个
		Stack<ListNode> stack = new Stack<ListNode>();
		int count =0;
		while(head!=null){
			stack.push(head);
			head = head.next;
			count++;
		}
		
		if(count < k){
			return null;
		}
		
		ListNode knode = null;
		for(int i=0; i< k;i++){
			knode = stack.pop();
		}
		return knode;
	}
	

	/**
	 *	最优代码
	 * 代码思路如下：两个指针，先让第一个指针和第二个指针都指向头结点，然后再让第一个指正走(k-1)步，到达第k个节点。
	 * 然后两个指针同时往后移动，当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了。。
	 * 
	 * 
	 * 相当于制造了一个K长度的尺子，把尺子从头往后移动，当尺子的右端与链表的末尾对齐的时候，
	 * 尺子左端所在的结点就是倒数第k个结点！
	 */
	public ListNode FindKthToTail3(ListNode head, int k){
		if(head == null || k == 0){
			return null;
		}
		ListNode pre=head;
        ListNode last=head;       
        for(int i=1;i<k;i++){
            if(pre.next!=null){
                pre=pre.next;
            }else{
                return null;
            }
        }
        while(pre.next!=null){
            pre = pre.next;
            last=last.next;
        }
        return last;
	}
	
	public ListNode FindKthToTail4(ListNode head, int k){
		ListNode p,q;
		p = q = head;
		int i=0;
		for(; p!=null; i++){
			if(i >= k){
				q = q.next;
			}
			p = p.next;
		}
		return i < k ? null : q;
	}
	
	
}
