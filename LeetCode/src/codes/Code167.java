package codes;

//two sum-II sorted array

/*Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.*/

public class Code167 {

	public static void main(String[] args) {
		int nums[]= {2,7,11,15};
		int target = 9;
		int output[] = twoSum(nums, target);
		
		System.out.print("[");
		for(int i=0; i<output.length; i++) {
			if(i==output.length-1) {
				System.out.print(output[i]);
			}else {
				System.out.print(output[i]+", ");
			}
		}
		System.out.println("]");
	}
	
	public static  int[] twoSum(int[] nums, int target) {
		int start=0;
		int end=nums.length-1;
		
		while(start<end) {
			if(nums[start]+nums[end]==target) {
				return new int[] {start+1, end+1};
			}
			if(nums[start]+nums[end]>target) {
				end--;
			}else {
				start++;
			}
		}
		return null;
	}

}
