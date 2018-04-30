package pod;

import java.util.Scanner;

public class ClaraGCD {
	public static void Print(int A[]) {
    	System.out.println();
    	for (int i = 0; i < A.length; i++) {
    		   System.out.print(A[i]+" ");
    		    }
    	System.out.println();
    }
	public static int GCD(int a,int b) {
		int ans=0;
		int min=a<=b?a:b;
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b%i==0) {
				ans=i;
			}
		}
		return ans;
	}
	public static void solve(int n, int p[], int q[]){
    Print(p);
    syso

	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int T= scanner.nextInt();
	int N= scanner.nextInt();
//	int p[] =new int[N];
//	int q[] =new int[N+1]; 
//	for(int i=0;i<T;i++) {
//		for(int j=0;j<N;j++) {
//			p[j]=scanner.nextInt();
//		}
//		solve(N,p,q);
//	}
System.out.println(	GCD(T,N));
	scanner.close();
}
}
