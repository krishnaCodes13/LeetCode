package codes;

/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 */
//With Boyer Moore algorithm

public class Code169 {
	public static void main(String [] agrs) {
		int arr[] = {3,2,3};
		int max = majorityElement(arr);
		System.out.println(max);
	}
	 public static int majorityElement(int[] nums) {
	        int count = 0;
	        int max = 0;

	        for(int i=0; i<nums.length; i++){
	            if(count==0){
	                max=nums[i];
	            }

	            if(nums[i]==max){
	                count++;
	            }else{
	                count--;
	            }
	        }
	        return max; 
	    }

}
