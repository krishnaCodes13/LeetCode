package codes;

//remove elements

/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.*/

public class Code27 {

	public static void main(String[] args) {
		int nums[] = {3,2,2,3};
		int val = 3;
		
		int count = removeElement(nums, val);
		System.out.println(count);
		
		for(int i=0; i<count; i++) {
			if(i==count-1) {
				System.out.println(nums[i]);
			}else {
				System.out.println(nums[i]);
			}
		}

	}
	
	public static int removeElement(int nums[], int val) {
		int pos=0;
		int count=0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=val) {
				nums[pos]=nums[i];
				pos++;
				count++;
			}
		}
		return count;
	}

}
