package codes;

//Valid Palindrom

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

*/

public class Code125 {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrom(s));
	}
	
	public static boolean isPalindrom(String s) {
		String S = s.toLowerCase();
		int start=0;
		int end =S.length()-1;
		
		while(start<end) {
			while(start<end && !Character.isLetterOrDigit(S.charAt(start))) {
				start++;
			}
			
			while(start<end &&!Character.isLetterOrDigit(S.charAt(end))) {
				end--;
			}
			if(S.charAt(start)!=S.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
