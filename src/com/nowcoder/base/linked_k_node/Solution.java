package com.nowcoder.base.linked_k_node;

import java.util.Stack;

/**
 * ��Ŀ����
 * ����һ����������������е�����k����㡣
 * @author cwh
 *
 */
public class Solution {
	
	
	//ʱ�临�Ӷȣ�һ�α�������
	public ListNode FindKthToTail(ListNode head, int k){
		ListNode pre=null, p=null;
		//����ָ�붼ָ��ͷ�ڵ�
		p=head;
		pre=head;
		//��¼kֵ
		int a=k;
		//��¼�ڵ�ĸ���
		int count =0;
		//pָ�����ܣ����Ҽ�¼�ڵ�������pָ������k-1���ڵ��preָ�뿪ʼ�ܣ�
        //��pָ���ܵ����ʱ��pre��ָָ����ǵ�����k���ڵ�
		while(p!=null){
			p = p.next;
			count++;
			if(k<1){
				pre=pre.next;
			}
			k--;
		}
		//����ڵ����С������ĵ�����K���ڵ㣬�򷵻ؿ�
		if(count<a) return null;
		return pre;
	}


	//ʹ��Stack�����ڵ�ѹ��ջ�У���ȡ����k���ͺ�
	public ListNode FindKthToTail2(ListNode head, int k){
		if(head == null || k == 0){
			return null;
		}
			
		//�����Ȱ�����ת��Ȼ���ҳ���k��
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
	 *	���Ŵ���
	 * ����˼·���£�����ָ�룬���õ�һ��ָ��͵ڶ���ָ�붼ָ��ͷ��㣬Ȼ�����õ�һ��ָ����(k-1)���������k���ڵ㡣
	 * Ȼ������ָ��ͬʱ�����ƶ�������һ����㵽��ĩβ��ʱ�򣬵ڶ����������λ�þ��ǵ�����k���ڵ��ˡ���
	 * 
	 * 
	 * �൱��������һ��K���ȵĳ��ӣ��ѳ��Ӵ�ͷ�����ƶ��������ӵ��Ҷ��������ĩβ�����ʱ��
	 * ����������ڵĽ����ǵ�����k����㣡
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
