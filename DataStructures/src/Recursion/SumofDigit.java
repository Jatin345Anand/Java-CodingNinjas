package Recursion;

public class SumofDigit {
    static int sum=0;
	public static int sumOfDigits(int n){
		if(n<1) {
			return -1;
		}
		
		
		sumOfDigits(n/10);
		System.out.println(n+" : "+n%10);
	     sum = sum+ n%10;
	 return sum;

	}
	public static int sumOfDigitsPerfectCode(int n){
		if(n<0){
            return 0;
        }
		if(n>=0 && n<10){
            return n;
        }
		return n%10+sumOfDigitsPerfectCode(n/10); 
	}
	public static void main(String[] args) {
        int n = TakeData.TakeInt();
      System.out.println("Sum is : "+  sumOfDigits(n));
	}
}
