package Recursion4;

import java.util.Arrays;

import Recursion.TakeData;

public class ReturnSubsetofK {
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
	public static int[][] subsets(int input[]) {
		if(input.length==0) {
			int[][] ans = {{}};
			return ans;
		}
 		int[] ArrayforRecursionCall = CreateSmallArray(input);
 		int[][] ans = subsets(ArrayforRecursionCall);
 		int[][] bigans = new int[ans.length*2][];
		int k1=0,fnumber=input[0];
		
		for(int i=0;i<ans.length;i++) {
			bigans[k1++] = ans[i];
		}
		for(int i=0;i<ans.length;i++) {
			bigans[k1++] = CreateBigArray(fnumber,ans[i]);
		}
	 	return bigans;

	}
	public static int[][] subsetsSumK(int input[], int k) {
		int[][] ans = subsets(input); 
		int k1=0;
         for(int i=0;i<ans.length;i++) {
       	  if(CheckSum(k, ans[i])) {
       		   ans[k1++] = ans[i];
       	  } 
         }
         int[][] mainans= new int[k1][];
         mainans = Arrays.copyOf(ans, k1);
         return mainans;  
	}
	public static void main(String[] args) {
		int length = TakeData.TakeInt();
		int[] input = TakeData.TakeArray(length);
		int k = TakeData.TakeInt();
		System.out.println("Final ans k subsets ");
		TakeData.Print2dArray(subsetsSumK(input, k));
	}
}
