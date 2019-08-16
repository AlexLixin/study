package Leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/*
> 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
> 
> 返回滑动窗口中的最大值。
> 
> 示例:
> 
> 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
> 输出: [3,3,5,5,6,7] 
> 解释: 
> 
>   滑动窗口的位置                最大值
> ---------------               -----  
> [1  3  -1] -3  5  3  6  7       3  
>  1 [3  -1  -3] 5  3  6  7       3  
>  1  3 [-1  -3  5] 3  6  7       5  
>  1  3  -1 [-3  5  3] 6  7       5  
>  1  3  -1  -3 [5  3  6] 7       6  
>  1  3  -1  -3  5 [3  6  7]      7  
> 
> 提示：
> 
> 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。
> 
> 进阶：
> 
> 你能在线性时间复杂度内解决此题吗？
> 
> 来源：力扣（LeetCode）
> 链接：https://leetcode-cn.com/problems/sliding-window-maximum
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

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
			while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {//最关键的一步，新来的数会将前面比它小的数挤掉
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