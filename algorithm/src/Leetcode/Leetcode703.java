package Leetcode;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

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

	private int k;
	private int[] nums;
	private final PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1==o2?0:(o1>o2?-1:1);
		}
		
	});

	public KthLargest(int k, int[] nums) {
		super();
		this.k = k;
		this.nums = nums;
		for (int i : this.nums) {
			pq.add(i);
		}
	}

	public int add(int val) {
		pq.add(val);
		int[] tmp = new int[k];
		for (int i = 0; i < k; i++) {
			tmp[i] = pq.remove();
		}
		for (int i : tmp) {
			pq.add(i);
		}

		return tmp[k - 1];

	}
}

public class Leetcode703 {

	public static void main(String[] args) {
		int k = 3;
		int[] arr = { 4, 5, 8, 2 };
		KthLargest kthLargest = new KthLargest(3, arr);
		System.out.println(kthLargest.add(3));// returns 4
		System.out.println(kthLargest.add(5));// returns 5
		System.out.println(kthLargest.add(10));// returns 5
		System.out.println(kthLargest.add(9));// returns 8
		System.out.println(kthLargest.add(4));// returns 8
	}
}
