public class minSteptoOne {
	public static int countStepsTo1(int n,int outputSoFar){
		
		 
		if(n==1) {
			return outputSoFar;
		}
 		
		if(n%2==0) {
		  return countStepsTo1(n/2,outputSoFar+1);
		}
		else {
		  return  countStepsTo1(n/3,outputSoFar+1);
		}
		 
		
		}
	public static void main(String[] args) {
		int n = TakeData.TakeInt();
		System.out.println(countStepsTo1(n-1,1));
	}
}
