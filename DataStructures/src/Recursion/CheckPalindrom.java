package Recursion;

public class CheckPalindrom {
	static boolean ans = true;

	public static void isStringPalindromeh(String S1, String S2) {
		if (S1.length() == 0 || S2.length() == 0) {
			return;
		}
//	    for(int)
        
		isStringPalindromeh(S1.substring(1), S2.substring(1));
		if(S1.charAt(0)!=S2.charAt(0)) {
			ans =false;
		}
		System.out.println(S1.charAt(0) + " S1 : " + S1 + " " + S2.charAt(0) + " S2 : " + S2);

//	    return true;
	}

//	racecar  isStringPalindrome
	public static boolean isStringPalindrome(String S) {
		String S1 = "", S2 = "";
		if (S.length() % 2 != 0) {
			S1 = S.substring(0, S.length() / 2);
			S2 = S.substring(S.length() / 2 + 1);
		}
		S1 = S.substring(0, S.length() / 2);
		S2 = S.substring(S.length() / 2);
		StringBuilder s2 = new StringBuilder(S2);
		s2 = s2.reverse();
		System.out.println(S1 + "  " + S2 + "  " + S.substring(S.length() - 1));
		isStringPalindromeh(S1, s2.toString());
		return ans;
	}

	public static void main(String[] args) {
		String S = TakeData.TakeString();

		
		System.out.println("is Palindrom : "+ isStringPalindrome(S));
	}
}
