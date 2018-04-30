package pod;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

public class Evaluate {

	public static int LeftLocation(String s) {
		int ans=0;
		for(int i=currentIndex;i>=0;i--) {
			if(s.charAt(i)=='+' || s.charAt(i)=='*' || s.charAt(i)=='/' || s.charAt(i)=='-' ) {
				ans=i;
				break;
			}
		}
		
	return s.indexOf("-", 5);
	}
	public static int FindDivide(String s) {
		int ans=0;
		
		return s.indexOf("/");
	}
   public static int RightLocation(String s) {
	   int ans=0;
//		for(int i=currentIndex;i<s.length();i++) {
//			if(s.charAt(i)=='+' || s.charAt(i)=='*' || s.charAt(i)=='/' || s.charAt(i)=='-' ) {
//				ans=i;
//				break;
//			}
//		}
		return s.indexOf("*", 5);
	}
	public static void evaluate(String s) {
		Stack st = new Stack();
		ArrayDeque<Integer> AQ = new ArrayDeque<>();
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		int l=s.length();
		while(l!=0) {
			System.out.println(s);
			
			l--;
		}
	}
	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String S=scanner.next();
     //evaluate(S);
     S.codePointCount(2,3);
     System.out.print(S.indexOf("+",S.indexOf("-") ));
     System.out.print(S.indexOf("+",S.indexOf("*") ) );
     System.out.print( S.indexOf("+",S.indexOf("/") ));
     System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
     System.out.print(S.compareTo("*"));
     System.out.println();
     System.out.print(S.indexOf("-"));
     System.out.print(S.indexOf("+"));
     System.out.print(S.indexOf("/"));
     System.out.print(S.indexOf("*"));
     System.out.println(FindDivide(S));
     System.out.println(RightLocation(S));
     System.out.println(LeftLocation(S));
     scanner.close();
	}

}
