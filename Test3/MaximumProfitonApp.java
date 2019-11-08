package Test3;

import java.util.Arrays;

import Recursion.TakeData;

public class MaximumProfitonApp {
	public static int maximumProfit(int budget[]) {
		int n=budget.length;
		Arrays.sort(budget);
		int arr[]=new int[budget.length];
		for(int i=0;i<budget.length;i++)
		{
			arr[i]=n*budget[i];
			n--;
		}
		int max=arr[0];
		for(int i=1;i<budget.length;i++)
		{
		  if(arr[i]>max)
			  max=arr[i];
		}
		
		return max;

	}
	public static void main(String[] args) {
		int n = TakeData.TakeInt();
		int[] A = TakeData.TakeArray(n);
		System.out.println("Maximised Profit is "+maximumProfit(A));
	}
}
