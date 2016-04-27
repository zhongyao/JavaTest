package com.java.algorithm.BubbleSort;

/**
 * 冒泡排序算法
 * 
 * @author zhongyao
 * 
 */
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] nums = { 7,4, 9, 8, 2, 6, 3 };
		
//		int[] sortedNums = bubbleSort(nums);
		
		int[] sortedNums = bubbleSortReverse(nums); 
		
		for (int i = 0; i < sortedNums.length; i++) {
			
			System.out.println(sortedNums[i]);
		}
	}
	
	/**
	 * 从大到小
	 * @param nums
	 * @return
	 */
	private static int[] bubbleSortReverse(int[] nums) {
		int temp;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] < nums[j+1]) {
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		return nums;
	}

	/**
	 * 从小到大
	 * @param nums
	 * @return
	 */
	private static int[] bubbleSort(int[] nums) {
		int temp;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length-i-1; j++) {
				if (nums[j] > nums[j+1]) {
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		return nums;
	}

}
