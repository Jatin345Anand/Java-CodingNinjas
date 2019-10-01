package Recursion;

import java.util.Scanner;

public class PrintPermutation {

	public static int newRecursiveFunction(int a) {
		   if(a==0) {
			   return a;
		   }
           System.out.println("A = "+a);
           return newRecursiveFunction(a-1)*a*2;
	}
	public static void main(String[] args) {
    System.out.println("Hi.. Jatin.. welcome in Comptetive Programming!!");
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
    System.out.println("Ans = "+	newRecursiveFunction(a));
	scanner.close();
	}
     
}
