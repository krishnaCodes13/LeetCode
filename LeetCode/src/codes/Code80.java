package codes;

//remove duplicates from sorted array

/*Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.*/

public class Code80 {

	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,1,2,3,3};
		int count = removeDuplicates(nums);
		
		System.out.println(count);
		
		System.out.print("[");
		
		for(int i=0; i<count; i++) {
			if(i==count-1) {
				System.out.print(nums[i]);
			}else {
				System.out.print(nums[i]+", ");
			}
		}
		System.out.println("]");
	}
	
	public static int removeDuplicates(int nums[]) {
		if(nums.length==0) {
			return 0;
		}
		
		int pos=2;//because we need pair of 2
		
		for(int i=2; i<nums.length; i++) {
			if(nums[i]!=nums[pos-2]) {
				nums[pos]=nums[i];
				pos++;
			}
		}
		
		return pos;
	}

}
