package com.nowcoder.base.stack_to_queue;

import java.util.Stack;

/*
 * ���⣺
 * ������ջʵ��һ�����У���ɶ��е�Push��Pop�����������е�Ԫ��Ϊint����
 * 
 * ˼·��
 * 1.����˼·��Ԫ�������ν���ջ1���ٴ�ջ1���ε�����ջ2��Ȼ�󵯳�ջ2������Ԫ�أ��������̾���һ�����е��Ƚ��ȳ�
 * 2.�����ڽ���Ԫ�ص�ʱ����Ҫ�ж�����ջ��Ԫ�������
 * ��������ʱ�����������ǻ�����Ԫ�أ����У�˵��ջ2�е�Ԫ�ز�Ϊ�գ���ʱ���Ƚ�ջ2��Ԫ�ص��ص�ջ1 �У������ڡ�������״̬����
 * ��������ʱ������ջ1��Ԫ��ȫ������ջ2�У������ڡ�������״̬����
 * ����Ҫ�����ж��ǣ���ʱ��ջ2�Ƿ�Ϊ�գ���Ϊ�գ���ջ2Ԫ�ص��ص�ջ1����ʱ����ջ1Ԫ��ȫ������ջ2�У�ֱ��ջ1Ϊ�ա�
 */
public class Solution {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void push(int node){
		//���Ԫ��ʱȷ��stack2��Ԫ��ȫ������stack1��
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		stack1.push(node);
	}
	
	public int pop(){
		//ɾ��Ԫ��ʱȷ��stack1��Ԫ��ȫ������stack2��
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}

}
