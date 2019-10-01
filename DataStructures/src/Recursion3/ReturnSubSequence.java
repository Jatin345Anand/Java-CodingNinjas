package Recursion3;

import Recursion.TakeData;

public class ReturnSubSequence {
	    
	  
		public static String[] updateAns(char S,String[] previous) {
			String[] Current = new String[previous.length*2+1];
			for(int i=0;i<previous.length;i++) {
				Current[i] = previous[i];
			}
			Current[previous.length] = String.valueOf(S);
			int k=0;
			for(int i=previous.length+1;i<Current.length;i++) {
				Current[i] = S + previous[k++]+"";
			}
			
			return Current;
		}
		public static void printStringArray(String[] ans) {
			System.out.println();
//			System.out.println("lenght : "+ans.length);
			if(ans.length>0) {
				for(int i=0;i< ans.length;i++) {
					System.out.println("A["+i+"] : "+ans[i]);
				}	
			}
			
			System.out.println();
		}
		public static String[] Finalans;
		public static String[] subsequenceh(String input,String[] ans){
			if(input.length()<=0) {
				 return ans;
			 }
		
	 
			System.out.println("Before Update ans : ");
				 printStringArray(ans);
				 ans = updateAns(input.charAt(input.length()-1),ans);
	 
				 System.out.println("String : "+input+"  "+input.charAt(input.length()-1));
				 subsequenceh(input.substring(0, input.length()-1),ans);
				 System.out.println("After Update ans : ");
				 
				 printStringArray(ans);
					if(input.length()==1) {
						Finalans = ans;
			 		}
				 return  Finalans;
		}
		public static String[] subsequence(String input) {
			String[] ans= {};
			if(input.length()<=0) {
				 return null;
			 }
			System.out.println("in subsequence input B : "+input+" "+ans.length);
			ans = subsequenceh(input,ans);
			System.out.println("in subsequence input A: "+input+" "+ans.length);
			return ans;
		}
		public static String[] findSubsequence(String input) {
			if(input.length()<=0) {
                String[] ans= {""};
				return ans;
				
			}
			String[] ans= {"",""};
			System.out.println("ans length : "+ans.length);
			System.out.println("Input above : "+input);
			String[] smallAns = findSubsequence(input.substring(1));
			
			System.out.println("Small ans len : "+smallAns.length+" imput : "+input);
			printStringArray(smallAns);
			String Ans[] =new String[smallAns.length*2];
			for(int i=0;i<smallAns.length;i++) {
				Ans[i] = smallAns[i];
			}
			for(int i=0;i<smallAns.length;i++) {
				Ans[i+smallAns.length] = input.charAt(0)+ smallAns[i];
			}
			return Ans;
		}
		public static void main(String[] args) {
			String S = TakeData.TakeString();
//			String ans[]= {};
//			System.out.println("Ans : "+ ans);
//			String ans[] = subsequence(S);
			String ans[] =findSubsequence(S);
			System.out.println("Final ans : ");
			printStringArray(ans);
		}
}
