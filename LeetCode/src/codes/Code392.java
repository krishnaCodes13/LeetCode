package codes;

//Is Subsequence


/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) 

of the characters without disturbing the relative positions of the remaining characters. 

(i.e., "ace" is a subsequence of "abcde" while "aec" is not).*/
public class Code392 {

	public static void main(String[] args) {
		String s="axc";
		String t="ahbgdc";
		
		System.out.println(isSubsequence(s,t));

	}
	
	public static boolean isSubsequence(String s, String t) {
		int left =0;
		int right =0;
		int count=0;
		
		while(left<s.length() && right<t.length()){
			if(s.charAt(left)==t.charAt(right)) {
				left++;
				right++;
				count++;
			}else {
				right++;
			}
		}
		
		if(count==s.length()) {
			return true;
		}else {
			return false;
		}
		
	}

}
