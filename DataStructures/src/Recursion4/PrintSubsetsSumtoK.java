package Recursion4;

import Recursion.TakeData;

public class PrintSubsetsSumtoK {
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
	
		int k=0;
	  	for(int i=0;i<A.length;i++) {
			ans[k++] = A[i];
		}
		ans[ans.length-1] = fn;
		return ans;
	}
	public static void printSubsetsSumTok(int input[], int[] OutputSoFar,int k) {
		if (input.length == 0) {
			if(k==0) {
				TakeData.Print1dArray(OutputSoFar);

				return;		
			}
			else {
//				int[]  ans = new int[0];
				return ;
			}
			
		}
		printSubsetsSumTok(CreateSmallArray(input), CreateBigArray(input[0], OutputSoFar),k-input[0]);
		printSubsetsSumTok(CreateSmallArray(input), OutputSoFar,k);
	}
	public static void printSubsetsSumTok(int input[], int k) {
		int[] OutputSoFar= {};
		
	 	printSubsetsSumTok(input, OutputSoFar,k);
		
	}
	public static void main(String[] args) {
		int length = TakeData.TakeInt();
		int[] input = TakeData.TakeArray(length);
		int k = TakeData.TakeInt();
		printSubsetsSumTok(input, k);
	}
}
