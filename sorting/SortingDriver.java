package sorting;

import java.util.Arrays;

public class SortingDriver {

	public static void bubbleSort(int[] nums) {
		int tempNum;
		boolean sorted = false;
		
		while(sorted == false) {
			sorted = true;
			for(int i = 0; i < nums.length - 1; i++) {
				
				//if the current number is greater than the one after, swap them and
				//mark the array as not sorted
				
				//sorted will only ever be true if this if statement is not entered
				//which would mean all the numbers are in ascending order
				if(nums[i] > nums[i + 1]) {
					tempNum = nums[i + 1];
					nums[i + 1] = nums[i];
					nums[i] = tempNum;
					sorted = false;
				}
			}
		}
		
		System.out.println("Bubble Sort\n" + Arrays.toString(nums));
	}
	
	public static void insertionSort(int[] nums) {
		
	}
	
	public static void mergeSort() {
		
	}
	
	public static void main(String[] args) {
		var nums = new int[] {5, 2, 8, -1, -23, 5, 1, 0, 5};

		bubbleSort(nums);
		insertionSort(nums);
	}

}
