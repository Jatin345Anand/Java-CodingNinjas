package Recursion4;

import Recursion.TakeData;

public class printAllCodes {
	public static boolean isIntSingle(String i) {
		int intCode = i.charAt(0);
//		System.out.println(intCode);
		if(intCode>=48 && intCode<=57) {
			return true;
		}
		return false;
	}
	public static boolean isInt(String i) {
		int intCode1 = i.charAt(0);
		int intCode2 = i.charAt(1);
		boolean ans1=false;
		boolean ans2=false;
//		System.out.println(intCode1+" "+intCode2);
		if(intCode1>=48 && intCode1<=57) {
			ans1 = true;
		}
		if(intCode2>=48 && intCode2<=57) {
			ans2 = true;
		}
		return ans1 && ans2;
	}
	public static void printAllPossibleCodes(String input,String outputSoFar) {
		if(input.length()==0) {
			System.out.println(outputSoFar);
			return;
		}
		if(isIntSingle(input.charAt(0)+"")) {
			int ir = 'a';
			int it= Integer.valueOf(input.charAt(0)+""); 
			int ansi = it+ir-1; 
			printAllPossibleCodes(input.substring(1),outputSoFar+(char)ansi);
		}
		if(input.length()>=2 && isInt(input.substring(0, 2))) {
			if(Integer.valueOf(input.substring(0, 2))>10 && Integer.valueOf(input.substring(0, 2))<27) {
				printAllPossibleCodes(input.substring(2), outputSoFar+(char)(Integer.valueOf(input.substring(0, 2))+'a'-1));
			}	
		}
		
	}
	public static void printAllPossibleCodes(String input) {
           printAllPossibleCodes(input,"");
	}
   public static void main(String[] args) {
	String input = TakeData.TakeString();
	printAllPossibleCodes(input);
}
}
