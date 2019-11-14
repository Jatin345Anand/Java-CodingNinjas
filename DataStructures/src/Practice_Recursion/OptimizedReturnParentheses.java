
package Practice_Recursion;

import java.util.ArrayList;
import java.util.Arrays;

import Recursion.TakeData;

public class ReturnParanthresis {
//	public static String[] findParenthesis(int n) {
//		if (n == 1) {
//			String[] ans = { "()" };
//			return ans;
//		}
//		String[] smallans = findParenthesis(n - 1);
//		String[] bigans = new String[(3 * smallans.length) - 1];
//		int k = 0;
//		for (int i = 0; i < smallans.length; i++) {
//			bigans[k++] = "(" + smallans[i] + ")";
//			
//		}
//		for (int i = 0; i < smallans.length-1; i++) {
//			bigans[k++] = smallans[i] + "()";
//			bigans[k++] = "()" + smallans[i];
//		
//			 	
//		}
////		bigans[k++] = "(" + smallans[smallans.length - 1] + ")";
//		bigans[k++] = smallans[smallans.length - 1]+"()";
//		return bigans;
//	}
	public static void findParenthesis(int n1, int n2, String outputSoFar, ArrayList<String> Ans) {
		if (n1 == 0 && n2 == 0) {
////			System.out.println("("+n1+" , "+n2+")"+" "+outputSoFar);
////			String ans[] = new String[0];
////			Ans = Arrays.copyOf(Ans, Ans.length + 1);
//////			System.out.println(outputSoFar);
////			
////			Ans[Ans.length - 1] = outputSoFar;
//			int oldSize = java.lang.reflect.Array.getLength(Ans);
//			Class elementType = Ans.getClass().getComponentType();
//			Object newArray = java.lang.reflect.Array.newInstance(elementType, oldSize+1);
//			int preserveLength = Math.min(oldSize, oldSize+1);
//			if (preserveLength > 0)
//				System.arraycopy(Ans, 0, newArray, 0, preserveLength);
//			System.out.println(Ans.length);
			Ans.add(outputSoFar);
			return;
		}
//		System.out.println("Left Call");

		if (n1 > 0) {
			findParenthesis(n1 - 1, n2, outputSoFar + "(", Ans);
		}
		if (n1 < n2) {
			findParenthesis(n1, n2 - 1, outputSoFar + ")", Ans);

		}

	}

	public static String[] findParenthesis(int n) {
//		
		ArrayList<String> Ans = new ArrayList<String>();
		findParenthesis(n, n, "", Ans);
		String ans[] = new String[Ans.size()];
		for(int i=0;i<Ans.size();i++) {
			ans[i]=Ans.get(i);
		}
//	    TakeData.Print1dStringArray(ans);
		return ans;
	}

	public static void main(String[] args) {
//	String input = TakeData.TakeString();
		int n = TakeData.TakeInt();
		TakeData.Print1dStringArray(findParenthesis(n));
	}
}
