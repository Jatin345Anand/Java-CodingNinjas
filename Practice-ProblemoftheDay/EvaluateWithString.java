package pod;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class EvaluateWithString {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	     String S=scanner.next();
	     
	     System.out.println(createStringSolveOperator(S,S.indexOf("/")));
	     System.out.println();
	     System.out.println(SolveDivide(S));
	     //evaluate(S);
        scanner.close();
	}
	
	private static void evaluate(String s) {
		  String ans1=SolveDivide(s);
		  String ans2=SolveMultiply(s);
		  String ans3=SolveSum(s);
		  String ans4=SolveSubtract(s);
		  System.out.println(" /  = "+ans1);
		  System.out.println(" x  = "+ans2);
		  System.out.println(" +  = "+ans3);
		  System.out.println(" -  = "+ans4);
	}

	private static String SolveSubtract(String S) {
	    
		 Stack s= new Stack();
	      Stack s1= new Stack();
	      System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	      for(int i=0;i<S.length();i++) {
	    	  if(S.charAt(i)=='-') {
	    		  s.push(S.charAt(i));
	    		  s1.push(i);
	    	  }
	      }
	      System.out.println(s);
	      System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
	      System.out.println(s1); 
	   	return null;
	}

	private static String SolveSum(String S) {
		 Stack s= new Stack();
	      Stack s1= new Stack();
	      
	      for(int i=0;i<S.length();i++) {
	    	  if(S.charAt(i)=='+') {
	    		  s.push(S.charAt(i));
	    		  s1.push(i);
	    	  }
	      }
	      System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	      System.out.println(s);
	      System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
	      System.out.println(s1);
		return null;
	}

	private static String SolveDivide(String S) {
		 ArrayList<Integer> AL = new ArrayList<>(); 
	      for(int i=0;i<S.length();i++) {
	    	  if(S.charAt(i)=='/') {
	    		  AL.add(i);
	    	  }
	      }
	      for(int i=0;i<AL.size();i++) {
	    	  System.out.println(AL.get(i));
	      }
	      ArrayList<String> AS=new ArrayList<>();
	      for(int i=0;i<AL.size();i++) {	
	    	  AS.add(createStringSolveOperator(S,AL.get(i)));
	      }
	      System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	      System.out.println(S);
	      
	      System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
	      for(int i=0;i<AS.size();i++) {
	    	  System.out.println(AS.get(i));
	      }
		return null;
	}
	private static String createStringSolveOperator(String s,int elementAt) {
		int index=elementAt;
		String ans;
		ans=  String.valueOf(Float.parseFloat( s.substring( LeftLocation(s, index)+1, index))/Float.parseFloat(s.substring(index+1, RightLocation(s, index) )));
		return ans;
	}

	public static int LeftLocation(String s,int currentIndex) {
		int ans=0;
		for(int i=currentIndex-1;i>=0;i--) {
			if(s.charAt(i)=='+' || s.charAt(i)=='*' || s.charAt(i)=='/' || s.charAt(i)=='-' ) {
				ans=i;
				break;
			}
		}
		
	return ans;
	}
    public static int RightLocation(String s,int currentIndex) {
	   int ans=0;
	for(int i=currentIndex+1;i<s.length();i++) {
			if(s.charAt(i)=='+' || s.charAt(i)=='*' || s.charAt(i)=='/' || s.charAt(i)=='-' ) {
				ans=i;
				break;
			}
		}
		return ans;
	}

	private static String SolveMultiply(String S) {
		 Stack s= new Stack();
	      Stack s1= new Stack();
	      
	      for(int i=0;i<S.length();i++) {
	    	  if(S.charAt(i)=='*') {
	    		  s.push(S.charAt(i));
	    		  s1.push(i);
	    	  }
	      }
	      System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	      System.out.println(s);
	      System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
	      System.out.println(s1);
		
		return null;
	}

}
