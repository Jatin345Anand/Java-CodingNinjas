package Recursion;

public class GeometricSum {
	public static double findGeometricSum(int k){
		if(k==0) {
			return 1;
		}
		if(k==1) {
			return 1+1/Math.pow(2, k);
		}
		double smallAns = findGeometricSum(k-1);
		System.out.println("Small Ans : "+smallAns );
		return 1/Math.pow(2, k)+smallAns;
	 
	}
	public static void main(String[] args) {
		// 1+ 1/2 + 1/4 + 1/8 + 1/16 ... 1/2^k
		int n = TakeData.TakeInt();
		System.out.println("Geometric Sum : "+findGeometricSum(n));
	}
}
