package Leetcode;

import java.util.Deque;
import java.util.LinkedList;

/*
ʹ��ջʵ�ֶ��е����в�����

push(x) -- ��һ��Ԫ�ط�����е�β����
pop() -- �Ӷ����ײ��Ƴ�Ԫ�ء�
peek() -- ���ض����ײ���Ԫ�ء�
empty() -- ���ض����Ƿ�Ϊ�ա�

ʾ��:

MyQueue queue = new MyQueue();

queue.push(1);
queue.push(2);  
queue.peek();  // ���� 1
queue.pop();   // ���� 1
queue.empty(); // ���� false

˵��:

��ֻ��ʹ�ñ�׼��ջ���� -- Ҳ����ֻ�� push to top, peek/pop from top, size, �� is empty �����ǺϷ��ġ�
����ʹ�õ�����Ҳ��֧��ջ�������ʹ�� list ���� deque��˫�˶��У���ģ��һ��ջ��ֻҪ�Ǳ�׼��ջ�������ɡ�
�������в���������Ч�� �����磬һ���յĶ��в������ pop ���� peek ��������

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/implement-queue-using-stacks
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������*/
class MyQueue {

	Deque<Integer> stack1;
	Deque<Integer> stack2;

	/** Initialize your data structure here. */
	public MyQueue() {
		stack1 = new LinkedList<Integer>();
		stack2 = new LinkedList<Integer>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		stack1.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		transferToStack2();
		return stack2.pop();
	}

	/** Get the front element. */
	public int peek() {
		transferToStack2();
		return stack2.peek();
	}

	private void transferToStack2() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
}

public class Leetcode232 {
	public static void main(String[] args) {
		MyQueue obj = new MyQueue();
		obj.push(1);
		obj.push(2);
		int param_2 = obj.peek();
		System.out.println(param_2);
		int param_3 = obj.pop();
		System.out.println(param_3);
		boolean param_4 = obj.empty();
		System.out.println(param_4);
	}
}
