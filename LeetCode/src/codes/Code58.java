package codes;

// length of last word
/*Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.*/
public class Code58 {
	public static void main(String[] args) {
		String s = "Hello World";
		
		System.out.println(lengthOfLastWord(s));
	}
	
	public static int lengthOfLastWord(String s) {
		String string = s.trim();
		char arr[] = string.toCharArray();
		int count=0;
		for(int i=arr.length-1; i>0; i--) {
			if(arr[i]==' ') {
				break;
			}
			count++;
		}
		return count;
	}

}
