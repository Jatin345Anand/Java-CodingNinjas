package Recursion4;

import Recursion.TakeData;

public class ReturnPermutation {
	public static void printStringArray(String[] ans) {
		System.out.println();
		System.out.println("lenght : "+ans.length);
		if(ans.length>0) {
			for(int i=0;i< ans.length;i++) {
				System.out.print(ans[i]+",");
			}	
		}
		
		System.out.println();
	}
    public static int fact(int i) {
    	if(i==0 || i==1) {
    		return 1;
    	}
    	if(i<0) {
    		return 0;
    	}
    	return i*fact(i-1);
    }
    public static String[] permutationOfStringNew(String input){
		if(input.length()<1) {
			String[] ans= {""};
			return ans;
		}
//		String smallPermutaions[]=permutationOfStringNew(input.substring(1));
		String[] Ans =  new String[fact(input.length())];
		int k=0;
//		for(int i=smallPermutaions.length;i++) {
//		    Ans[k++] = FirstChar+smallPermutaions[i];
////			Ans[k++] = input.charAt(i)+input.substring(0, i)+input.substring(i+1, input.length());
//		}
		for(int i=0;i<input.length();i++) {
			System.out.println("First Char : "+input.charAt(i));
			System.out.println("Remaining String : "+input.substring(0, i)+input.substring(i+1, input.length()));
			String smallPermutaions[]=permutationOfStringNew(input.substring(0, i)+input.substring(i+1, input.length()));
	        for(int j=0;j<smallPermutaions.length;j++) {
	            Ans[k++] = 	input.charAt(i)+smallPermutaions[j];
	        }
		}
		
		return Ans; 
	}
	public static String[] permutationOfString(String input){
		if(input.length()<1) {
			String[] ans= {""};
			return ans;
		}
		String[] smallAns = permutationOfString(input.substring(1));
		printStringArray(smallAns);
		String StartingChar = input.charAt(0)+"";
//		System.out.println(StartingChar);
		String[] Ans = new String[fact(input.length())];
		int k=0;
		
		for(int i=0;i<smallAns.length;i++) {
			Ans[k++] = StartingChar+smallAns[i];
			System.out.println(smallAns[i]);
			System.out.println(smallAns[i].length());
			for(int j=0;j<smallAns[i].length();j++) {
				System.out.println(smallAns[i].substring(0, j));
				System.out.println(StartingChar);
				System.out.println(smallAns[i].substring(j, smallAns[i].length()));
				System.out.println(smallAns[i].substring(0, j+1)+StartingChar+ smallAns[i].substring(j+1, smallAns[i].length()));
				Ans[k++] = smallAns[i].substring(0, j+1)+ StartingChar+smallAns[i].substring(j+1, smallAns[i].length()) ;		
			}
		}
		printStringArray(Ans);
		return Ans;
	}
	public static void main(String[] args) {
		String input= TakeData.TakeString();
//		int n= TakeData.TakeInt();
//		System.out.println("Fact : "+fact(n));
//	   printStringArray(permutationOfString(input));
		printStringArray( permutationOfStringNew(input));
////	System.out.println("in string array");
////	char ans[] = {'c'};
//	char ans[] = new char[3];
//	int[] ansint= new int[3];
////	main(ansint);
//	int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
//	int temp = 0;
//	for(int i = 0, j= 0;i<arr.length; i++ ) {
//		if(arr[i]<0 && i!=j) {
//			temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//			j++;
//		}
//	}
//	for(int i : arr) {
//		System.out.print(i + " ");
	}
}
//public static void main(char[] args) {
//	System.out.println("in char array "+args[0]);
//}
//public static void main(int[] args) {
//	System.out.println(args[0]);
//}

