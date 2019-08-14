package Leetcode;

import java.util.Deque;
import java.util.LinkedList;

/*
����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��

��Ч�ַ��������㣺

    �����ű�������ͬ���͵������űպϡ�
    �����ű�������ȷ��˳��պϡ�

ע����ַ����ɱ���Ϊ����Ч�ַ�����

ʾ�� 1:

����: "()"
���: true

ʾ�� 2:

����: "()[]{}"
���: true

ʾ�� 3:

����: "(]"
���: false

ʾ�� 4:

����: "([)]"
���: false

ʾ�� 5:

����: "{[]}"
���: true

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/valid-parentheses
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 */

public class Leetcode20 {

	private static class Stack<T> {
		Deque<T> stack = new LinkedList<>();

		public void push(T t) {
			stack.push(t);
			;
		}

		public T pop() {
			return stack.pop();
		}

		public boolean isEmpty() {
			return stack.isEmpty();
		}
	}

	private Stack<Character> stack = new Stack<Character>();

	public Leetcode20(String[] inputs) {
		for (String input : inputs) {
			System.out.println("input:" + input + "  is " + isValid(input));
		}
	}

	private String isValid(String input) {

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '(' || c == '[' || c == '{')
				stack.push(c);
			if (c == ')' || c == ']' || c == '}') {
				if (stack.isEmpty()) {
					return "invalid";
				}
				char pop = stack.pop();
				switch (pop) {
					case '(': {
						if (c != ')')
							return "invalid";
						break;
					}
					case '[': {
						if (c != ']')
							return "invalid";
						break;
					}
					case '{': {
						if (c != '}')
							return "invalid";
						break;
					}
				}
			}
		}
		

		if (stack.isEmpty()) {
			return "valid";
		} else {
			return "invalid";
		}

	}

	public static void main(String[] args) {
		String[] input = { "()", "()[]{}", "(]", "([)]" };
		new Leetcode20(input);
	}

}
