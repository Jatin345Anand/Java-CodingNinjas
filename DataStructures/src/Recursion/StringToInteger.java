package Recursion;

public class StringToInteger {

	static int ans = 0, i = 0;

	public static int convertStringToInt(String S) {
		if (S.length() == 0) {
			return 0;
		}

		ans = 10 * ans + Integer.parseInt(String.valueOf(S.charAt(0)));
		i++;
		convertStringToInt(S.substring(1));
		
		return ans;
	}

	public static void main(String[] args) {
		String S = TakeData.TakeString();
		System.out.println("Ans : " + convertStringToInt(S));
	}
}
