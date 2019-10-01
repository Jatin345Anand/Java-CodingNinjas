package Recursion;

public class CountZeros {
	static int sum =0;
	public static int CountZero(int n) {
		
		if(n<1) {
			return -1;
		}
		
		
		CountZero(n/10);
		System.out.println(n+" : "+n%10);
		if(n%10==0) {
			sum++;
		}
	 return sum;
	}
public static void main(String[] args) {
	int n = TakeData.TakeInt();
	CountZero(n);
	System.out.println("Total Zeros are : "+sum	 );
}
}
