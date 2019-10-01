package Recursion4;

import Recursion.TakeData;

public class PrintPermutation {
	public static void permutations(String input,String OutputSoFar){
        if(input.length()==0) {
        	System.out.println(OutputSoFar);
        }
    	for(int i=0;i<input.length();i++) {
			System.out.println("First Char : "+input.charAt(i));
			System.out.println("Remaining String : "+input.substring(0, i)+input.substring(i+1, input.length()));
			permutations(input.substring(0, i)+input.substring(i+1, input.length()), OutputSoFar+input.charAt(i)); 
		}
	}
	public static void permutations(String input){
            permutations(input, "");
	}
	public static void main(String[] args) {
		String input = TakeData.TakeString();
		permutations(input);
	}
}
