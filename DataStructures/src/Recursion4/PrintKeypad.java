package Recursion4;

import Recursion.TakeData;

public class PrintKeypad {
	public static String[] KEYPAD = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void printKeypad(String input,StringBuilder sb) {
	 if(sb.length()==input.length()) {
         System.out.println(sb.toString());;
		 return;
	 }
	 System.out.println(sb.length()); 
	 System.out.println(input.charAt(sb.length()));
	 System.out.println(Integer.valueOf(input.charAt(sb.length())+""));
	 System.out.println(KEYPAD[Integer.valueOf(input.charAt(sb.length())+"")]);
//	 System.out.println(KEYPAD[input.charAt(sb.length())].length());
	 for(int c=0;c<KEYPAD[Integer.valueOf(input.charAt(sb.length())+"")].length();c++) {
		 sb.append(KEYPAD[Integer.valueOf(input.charAt(sb.length())+"")].charAt(c));
		 printKeypad(input,sb);
		 sb.deleteCharAt(sb.length()-1);
	 }
	}
	
	public static void printKeypad(int input){
	  StringBuilder sb = new StringBuilder();
	  printKeypad(String.valueOf(input),sb);	
	}
	public static void main(String[] args) {
		int n = TakeData.TakeInt();
		printKeypad(n);
	}
}
