package Recursion4;

import Recursion.TakeData;

public class ReturnsSubsetsSumtoK {
	public static int[] CreateSmallArray(int[] input) {
		int[] Ans = new int[input.length-1];
		int k=0;
		for(int i=1;i<input.length;i++) {
			Ans[k++] = input[i]; 
		}
		return Ans;
	}
	public static int[] CreateBigArray(int fn,int[] A) {
		int[] ans = new int[A.length+1];
		ans[0] = fn;
		int k=1;
	  	for(int i=0;i<A.length;i++) {
			ans[k++] = A[i];
		}
		return ans;
	}
	public static boolean CheckSum(int k,int A[]) {
		int sum=0;
		for(int i=0;i<A.length;i++) {
			sum = sum + A[i];
		}
		if(sum==k) {
			return true;
		}
		return false;
	}
	public static int[][] subsetsSumK(int input[], int k) {
     if(input.length==0) {
    	 if(k==0) {
    		 int[][] ans =  new int[1][0];
    		 return ans;
    	 }
    	 else {
    		 int[][] ans =  new int[0][0];
    		 return ans;
    	 }
     }
     int[] smallInput = CreateSmallArray(input);
     int[][] firstSmallAns = subsetsSumK(smallInput, k-input[0]);
     int[][] SecondSmallAns = subsetsSumK(smallInput, k);
     int[][] BigAns = new int[firstSmallAns.length+SecondSmallAns.length][];
     int k1=0;
     for(int i=0;i<firstSmallAns.length;i++) {
    	 BigAns[k1++] = CreateBigArray(input[0], firstSmallAns[i]);
     }
     for(int i=0;i<SecondSmallAns.length;i++) {
    	 BigAns[k1++] = SecondSmallAns[i];
     }
     return BigAns;
	}
	public static void main(String[] args) {
		int length = TakeData.TakeInt();
		int[] input = TakeData.TakeArray(length);
		int k = TakeData.TakeInt();
		System.out.println("Final ans k subsets ");
		TakeData.Print2dArray(subsetsSumK(input, k));
	}
}
