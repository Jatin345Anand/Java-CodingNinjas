package Recursion4;

import Recursion.TakeData;

public class ReturnKeypad {
	public static void printStringArray(String[] ans) {
		System.out.println();
//		System.out.println("lenght : "+ans.length);
		if(ans.length>0) {
			for(int i=0;i< ans.length;i++) {
				System.out.print(ans[i]+",");
			}	
		}
		
		System.out.println();
	}
	public static String[] keypad(String input,String ans) {
		if(input.length()<=0) {
			String[] as= {""};
			return as;
		}
		
		String[] Previous = keypad(input.substring(1), ans);
//		System.out.println("Current String is "+KEYPAD[Integer.parseInt(input.charAt(0)+"")]);
//		String[] Ans = new String[];
		
		String Current[] = new String[KEYPAD[Integer.parseInt(input.charAt(0)+"")].length()*Previous.length];
        String currentStr = KEYPAD[Integer.parseInt(input.charAt(0)+"")];
		int k=0;
		for(int i=0;i<Previous.length;i++) {
        	for(int j=0;j<currentStr.length();j++) {
        		System.out.println(currentStr.charAt(j)+Previous[i]+"");
        		Current[k] = currentStr.charAt(j)+Previous[i]+"";
        		k++;
        	}
        }
//		if(currentStr.length()!=0) {
//        for(int i=0;i<currentStr.length();i++) {
//        	for(int j=0;j<Previous.length;j++) {
//        		System.out.println(currentStr.charAt(i)+Previous[j]+"");
//        		Current[k] = currentStr.charAt(i)+Previous[j]+"";
//        		k++;
//        	}
//        }}
//		else {
//			Current = Previous;
//		}
        System.out.println("Previous Array ");
        printStringArray(Previous);
        System.out.println("Current Array ");
        printStringArray(Current);
		System.out.println("Current : "+currentStr);
		return Current;
	}
	public static String[] findKeypad(String input) {
		if(input.length()<=0) {
            String[] ans= {""};
			return ans;
			
		}
		System.out.println("Input above : "+input);
		String[] smallAns = findKeypad(input.substring(1));
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
	public static String[] KEYPAD = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//	public static 
	public static int i=0;
	public static String[] keypad(int n,int i,String[] ans) {
		if(n<=0) {
      	  String[] an= {""};
      	  return an;
        }
		keypad(n/10, i++, ans);  
        ans = new String[ans.length+1];
        
        System.out.println("n B : "+n+" Digit : "+n%10+" string : "+KEYPAD[n%10]);
//        ans[i]=KEYPAD[n%10];
        return ans;
	}
	public static String[] keypad(int n){
          
//		String[] UpdatedAns = {};
//		System.out.println("Before Updated Ans : "+UpdatedAns.length);
////          keypad(n,0,UpdatedAns);
//		UpdatedAns =;
////           CreateStringArr();
//          System.out.println("After Updated Ans : "+UpdatedAns.length);
          return  keypad(String.valueOf(n), "");
	}
	public static void main(String[] args) {
		int n =  TakeData.TakeInt();
	    String[] ans  = keypad(n);
	    System.out.println("Final Keypad Strings ");
	    printStringArray(ans);
	}
}
