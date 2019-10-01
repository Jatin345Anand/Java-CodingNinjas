package Recursion3;

import Recursion.TakeData;

public class StairCase {
	public static int findWays(int n){
	 if(n<=0) {
		 return 0;
	 }
	 if(n==1) {
		 return 1;
	 }
	 if(n==2) {
		 return findWays(n-1)+1;
	 }
	 if(n==3) {
		 return findWays(n-2)+findWays(n-1)+1;
	 }
	
		 return findWays(n-3)+findWays(n-2)+findWays(n-1);
	 
	}
	public static void main(String[] args) {
		int n = TakeData.TakeInt();
		System.out.println("Ans : "+findWays(n));
	}
}
