package codes;

public class Demo {

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		resolve(arr);

	}
	
	public static void resolve(int[]nums) {
		if(nums.length==5) {
			System.out.println(true);
		}
	}

}
