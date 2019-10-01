package Practice_Recursion;

import Recursion.TakeData;

public class CountInversion {
 
	public static long solve(int[] A, int n) {
       if(n==0 || n==1) {
    	   return 0;
       }
       System.out.println("A[n-1] : "+A[n-1]+ " A[n-2] : "+A[n-2]);
       if(A[n-1]<A[n-2]) {
    	   
    	   return   1+solve(A, n-1);
       }
       else {
    	   return solve(A, n-1);
       }
        
	}
	public static void main(String[] args) {
		int n = TakeData.TakeInt();	
		int A[] = new int[n];
		for (int i=0;i<A.length;i++) {
			A[i]=TakeData.TakeInt();
		}
		System.out.println(solve(A, n));
//		int e = TakeData.TakeInt();
	}
}
