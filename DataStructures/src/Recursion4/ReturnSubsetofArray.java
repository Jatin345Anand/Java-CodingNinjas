package Recursion4;

import java.util.Arrays;
import java.util.Scanner;

import Recursion.TakeData;

public class ReturnSubsetofArray {
	
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
		System.out.println("In createbig array");
		TakeData.Print1dArray(A);
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
		
//	    TakeData.Print1dArray(bigans[0]);
//	    TakeData.Print1dArray(bigans[1]);
//		System.out.println("ans length : "+ans.length +" ans[0] length : "+ans[0].length);
//		System.out.println("bigans length : "+bigans.length 
//				+" bigans[0] length : "+bigans[0].length
//				+" bigans[1] length : "+bigans[1].length);
		
		int[] ArrayforRecursionCall = CreateSmallArray(input);
        
//		TakeData.Print1dArray(ArrayforRecursionCall);
//		System.out.println("Current First Number : "+input[0]);
		int[][] ans = subsets(ArrayforRecursionCall);
//		int[][] Ans= new int[smallArrayAns.length*2][smallArrayAns[smallArrayAns.length-1].length]; 
//		int k1=0,k2=0;
//		for(int i=0;i<smallArrayAns.length;i++) {
//			for(int j=0;j<smallArrayAns[i].length;j++) {
//				Ans[k1][k2++]= smallArrayAns[i][j];
//			}
//			k1++;
//		}
//		for(int i=0;i<smallArrayAns.length;i++) {
//			for(int j=0;j<smallArrayAns[i].length;j++) {
//				Ans[k1][k2++]= input[0] + smallArrayAns[i][j];
//			}
//			k1++;
//		}
//		int[][] ans = {{}};
		int[][] bigans = new int[ans.length*2][];
		int k1=0,fnumber=input[0];
		
		for(int i=0;i<ans.length;i++) {
			bigans[k1++] = ans[i];
		}
		for(int i=0;i<ans.length;i++) {
			bigans[k1++] = CreateBigArray(fnumber,ans[i]);
		}
		TakeData.Print2dArray(bigans);
		return bigans;

	}
	public static void main(String[] args) {
		  int length = TakeData.TakeInt();
          int[] input = TakeData.TakeArray(length);
          int k = TakeData.TakeInt();
          int[][] ans=subsets(input);
          System.out.println("Final Ans");
          TakeData.Print2dArray(ans);
          int k1=0;
          for(int i=0;i<ans.length;i++) {
        	  if(CheckSum(k, ans[i])) {
        		  TakeData.Print1dArray(ans[i]);
        		  ans[k1++] = ans[i];
        	  } 
          }
          System.out.println("Final Subset of Array");
          int[][] mainans= new int[k1][];
          mainans = Arrays.copyOf(ans, k1);
          
          TakeData.Print2dArray(mainans);
	}
}
