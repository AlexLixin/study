package Leetcode;

import java.util.PriorityQueue;

/*
Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from the stream. For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.

Example:

int k = 3;
int[] arr = [4,5,8,2];
KthLargest kthLargest = new KthLargest(3, arr);
kthLargest.add(3);   // returns 4
kthLargest.add(5);   // returns 5
kthLargest.add(10);  // returns 5
kthLargest.add(9);   // returns 8
kthLargest.add(4);   // returns 8

Note:
You may assume that nums' length ≥ k-1 and k ≥ 1.

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/kth-largest-element-in-a-stream
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
class KthLargest {

	private final PriorityQueue<Integer> pq;
	private final int k;

	public KthLargest(int k, int[] nums) {
		this.k = k;
		this.pq = new PriorityQueue<Integer>(k);
		for (int i : nums) {
			add(i);
		}
	}

	public int add(int val) {

		if (pq.size() < k) {
			pq.offer(val);
		} else if (val > pq.peek()) {
			pq.poll();
			pq.offer(val);
		}
		return pq.peek();

	}
}

public class Leetcode703 {

	public static void main(String[] args) {
		int k = 3;
		int[] arr = { 4, 5, 8, 2 };
		KthLargest kthLargest = new KthLargest(k, arr);
		System.out.println(kthLargest.add(3));// returns 4
		System.out.println(kthLargest.add(5));// returns 5
		System.out.println(kthLargest.add(10));// returns 5
		System.out.println(kthLargest.add(9));// returns 8
		System.out.println(kthLargest.add(4));// returns 8
	}
}
