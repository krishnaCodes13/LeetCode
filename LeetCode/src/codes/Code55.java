package codes;
//jump game

/*You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.*/
public class Code55 {

	public static void main(String[] args) {
		int nums[] = {2,3,1,1,4};
		System.out.println(canJump(nums));

	}
	
	public static Boolean canJump(int nums[]) {
		int jump = 0;
		
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]>jump) {
				jump=nums[i];
			}
			if(jump<=0 && i<nums.length-1) {
				return false;
			}
			jump--;
		}
		return true;
	}
}
