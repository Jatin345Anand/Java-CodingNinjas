package Test3;

import java.util.ArrayList;

import Recursion.TakeData;

public class LargestMultipleof3 {

	public static int[] CreateSmallArray(int[] input) {
		int[] Ans = new int[input.length - 1];
		int k = 0;
		for (int i = 1; i < input.length; i++) {
			Ans[k++] = input[i];
		}
		return Ans;
	}

	public static int[] CreateBigArray(int fn, int[] A) {
		int[] ans = new int[A.length + 1];

		int k = 0;
		for (int i = 0; i < A.length; i++) {
			ans[k++] = A[i];
		}
		ans[ans.length - 1] = fn;
		return ans;
	}

	public static void printSubsets(int input[], int[] OutputSoFar) {
		if (input.length == 0) {
			for (int i = 0; i < OutputSoFar.length; i++) {
				System.out.print(OutputSoFar[i] + " ");
			}
			System.out.println();
			return;
		}
		printSubsets(CreateSmallArray(input), OutputSoFar);
//		printSubsets(CreateSmallArray(input), CreateBigArray(input[0], OutputSoFar));
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
    public static int[] ArrayListtoArray(ArrayList<Integer> AL) {
    	int[] ans= new int[AL.size()];
    	for(int i=0;i<AL.size();i++) {
    		ans[i] = AL.get(i);
    	}
    	return ans;
    	
    }
    public static ArrayList<Integer> ArraytoArrayList(int[] A) {
       	ArrayList<Integer> ans = new ArrayList<Integer>(A.length);
    	for(int i=0;i<A.length;i++) {
    		ans.add(A[i]);
    	}
    	return ans;
    	
    }
    public static boolean isMultipleof3(int[] A) {
    	boolean ans= false;
    	String number = "";
    	for(int i=0;i<A.length;i++) {
    		number = number+ String.valueOf(A[i]);
    	}
    	if(Integer.valueOf(number)%3==0) {
    		ans = true;
    	}
    	return ans;
    }
    public static int[] Revesre1dArray(int[] A) {
    	int[] ans = new int[A.length];
    	int j=0;
    	for(int i=A.length-1;i>=0;i--) {
    		ans[j++] = A[i];
    	}
    	return ans;
    }
	public static ArrayList<Integer> largestMultiple3(ArrayList<Integer> input) {
		ArrayList<Integer> ANS = new ArrayList<Integer>();
	    int[][] Ans = subsets(ArrayListtoArray(input));
	    for(int i=1;i<Ans.length;i++) {
	    	if(isMultipleof3(Ans[i])) {
	    	  TakeData.Print1dArray(Ans[i]);	
	    	}
	    	if(isMultipleof3(Revesre1dArray(Ans[i]))) {
	    		TakeData.Print1dArray(Revesre1dArray(Ans[i]));
	    	}
	    }
 		return ANS;

	}
public static void main(String[] args) {
	int len = TakeData.TakeInt();
	int[] ans = TakeData.TakeArray(len);
	largestMultiple3(ArraytoArrayList(ans));
//	System.out.println(isMultipleof3(ans));
}
}
