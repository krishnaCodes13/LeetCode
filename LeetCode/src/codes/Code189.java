package codes;

public class Code189 {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums, k);
		
		System.out.print("[");
		for(int i = 0; i<nums.length; i++) {
			if(i==nums.length-1) {
				System.out.print(nums[i]);
				break;
			}
			System.out.print(nums[i] + ", ");
			
		}
		System.out.println("]");
	}
	
	public static void rotate(int nums[], int k) {
		k=k%nums.length;
		
		reverse(nums, 0, nums.length-1);//[7,6,5,4,3,2,1]
		reverse(nums, 0, k-1);//[5,6,7,4,3,2,1]
		reverse(nums, k, nums.length-1);//[5,6,7,1,2,3,4]
	}
	
	public static void reverse(int nums[], int left, int right) {
		int start=left;
		int end=right;
		
		while(start<end) {
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}

}
