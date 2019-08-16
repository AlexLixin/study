package Leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/*
> ����һ������ nums����һ����СΪ k �Ļ������ڴ������������ƶ�����������Ҳࡣ��ֻ���Կ����ڻ��������ڵ� k �����֡���������ÿ��ֻ�����ƶ�һλ��
> 
> ���ػ��������е����ֵ��
> 
> ʾ��:
> 
> ����: nums = [1,3,-1,-3,5,3,6,7], �� k = 3
> ���: [3,3,5,5,6,7] 
> ����: 
> 
>   �������ڵ�λ��                ���ֵ
> ---------------               -----  
> [1  3  -1] -3  5  3  6  7       3  
>  1 [3  -1  -3] 5  3  6  7       3  
>  1  3 [-1  -3  5] 3  6  7       5  
>  1  3  -1 [-3  5  3] 6  7       5  
>  1  3  -1  -3 [5  3  6] 7       6  
>  1  3  -1  -3  5 [3  6  7]      7  
> 
> ��ʾ��
> 
> ����Լ��� k ������Ч�ģ����������鲻Ϊ�յ�����£�1 �� k �� ��������Ĵ�С��
> 
> ���ף�
> 
> ����������ʱ�临�Ӷ��ڽ��������
> 
> ��Դ�����ۣ�LeetCode��
> ���ӣ�https://leetcode-cn.com/problems/sliding-window-maximum
> ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������*/

class Solution {

	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return new int[0];
		}
		int[] result = new int[nums.length - k + 1];
		int index = 0;
		Deque<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i >= k && q.peekFirst() <= i - k) {
				q.pollFirst();
			}
			while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {//��ؼ���һ�������������Ὣ����ǰ���ұ���С��������
				q.pollLast();
			}
			q.offerLast(i);
			if (i >= k - 1) {
				result[index++] = nums[q.peekFirst()];
			}
		}
		return result;
	}

}

public class Leetcode239 {
	public static int[] stringToIntegerArray(String input) {
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return new int[0];
		}

		String[] parts = input.split(",");
		int[] output = new int[parts.length];
		for (int index = 0; index < parts.length; index++) {
			String part = parts[index].trim();
			output[index] = Integer.parseInt(part);
		}
		return output;
	}

	public static String integerArrayToString(int[] nums, int length) {
		if (length == 0) {
			return "[]";
		}

		String result = "";
		for (int index = 0; index < length; index++) {
			int number = nums[index];
			result += Integer.toString(number) + ", ";
		}
		return "[" + result.substring(0, result.length() - 2) + "]";
	}

	public static String integerArrayToString(int[] nums) {
		return integerArrayToString(nums, nums.length);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			int[] nums = stringToIntegerArray(line);
			line = in.readLine();
			int k = Integer.parseInt(line);

			int[] ret = new Solution().maxSlidingWindow(nums, k);

			String out = integerArrayToString(ret);

			System.out.print(out);
		}
	}
}