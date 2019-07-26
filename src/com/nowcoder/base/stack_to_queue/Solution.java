package com.nowcoder.base.stack_to_queue;

import java.util.Stack;

/*
 * 问题：
 * 用两个栈实现一个队列，完成队列的Push和Pop操作。队列中的元素为int类型
 * 
 * 思路：
 * 1.整体思路是元素先依次进入栈1，再从栈1依次弹出到栈2，然后弹出栈2顶部的元素，整个过程就是一个队列的先进先出
 * 2.但是在交换元素的时候需要判断两个栈的元素情况：
 * “进队列时”，队列中是还还有元素，若有，说明栈2中的元素不为空，此时就先将栈2的元素倒回到栈1 中，保持在“进队列状态”。
 * “出队列时”，将栈1的元素全部弹到栈2中，保持在“出队列状态”。
 * 所以要做的判断是，进时，栈2是否为空，不为空，则栈2元素倒回到栈1，出时，将栈1元素全部弹到栈2中，直到栈1为空。
 */
public class Solution {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void push(int node){
		//添加元素时确保stack2中元素全部倒回stack1中
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		stack1.push(node);
	}
	
	public int pop(){
		//删除元素时确保stack1中元素全部弹到stack2中
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}

}
