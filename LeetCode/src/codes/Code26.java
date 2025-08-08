package codes;

public class Code26 {

	public static void main(String[] args) {
		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		int count = removeDuplicate(nums);
		System.out.println(count);
		
		System.out.print("[");
		for(int i=0; i<count; i++) {
			if(i==count-1) {
				System.out.print(nums[i]);
				break;
			}
			System.out.print(nums[i]+", ");
		}
		System.out.println("]");

	}
	
	public static int removeDuplicate(int nums[]) {
		if(nums.length==0) {
			return 0;
		}
		
		int pos=1;
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i]!=nums[i-1]) {
				nums[pos]=nums[i];
				pos++;
			}
		}
		return pos;
	}

}
