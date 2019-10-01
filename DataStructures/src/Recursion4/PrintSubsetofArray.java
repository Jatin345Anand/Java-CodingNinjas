package Recursion4;

import Recursion.TakeData;

public class PrintSubsetofArray {
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
	public static void printSubsets(int input[], int[] OutputSoFar) {
		if (input.length == 0) {
			TakeData.Print1dArray(OutputSoFar);
			return;
		}
		printSubsets(CreateSmallArray(input), OutputSoFar);
		printSubsets(CreateSmallArray(input), CreateBigArray(input[0], OutputSoFar));
	}

	public static void printSubsets(int input[]) {
		int[] OutputSofar= {};
		 printSubsets(input,OutputSofar);
	}

	public static void main(String[] args) {
		int length = TakeData.TakeInt();
		int[] input = TakeData.TakeArray(length);
		printSubsets(input);
	}
}
