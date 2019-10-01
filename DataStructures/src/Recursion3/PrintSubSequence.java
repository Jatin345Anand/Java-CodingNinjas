package Recursion3;

import Recursion.TakeData;

public class PrintSubSequence {
	public static void printStringArray(String[] ans) {
		System.out.println();
		System.out.println("lenght : "+ans.length);
		if(ans.length>0) {
			for(int i=0;i< ans.length;i++) {
				System.out.print(ans[i]+",");
			}	
		}
		
		System.out.println();
	}
	
	public static void printSubsequences(String input, String OutputSoFar) {
		if(input.length()==0) {
			System.out.println("Output : "+OutputSoFar);
			return ;
		}
		printSubsequences(input.substring(1), OutputSoFar);
//		System.out.println("Input : "+input+" Output : "+OutputSoFar);
		printSubsequences(input.substring(1), OutputSoFar+input.charAt(0));
	}
	public static void printSubsequences(String input) {
		 
	    printSubsequences(input,"");
		 
		return ;
	}
	public static void main(String[] args) {
		String S = TakeData.TakeString();
//		String ans[]= {};
//		System.out.println("Ans : "+ ans);
//		String ans[] = subsequence(S);
		printSubsequences(S);
//		System.out.println("Final ans : ");
//		printStringArray(ans);
	}
}
