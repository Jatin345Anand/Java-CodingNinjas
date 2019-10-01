package Recursion;

import java.util.Scanner;

public class TakeData {
	public static Scanner scanner = new Scanner(System.in);

	public static int TakeInt() {
        return scanner.nextInt();
	}
	public static String TakeString() {
        return scanner.next();
	}
	public static boolean TakeBoolean() {
        return scanner.nextBoolean();
	}
	public static int[] TakeArray(int length) {
        int[] Arr = new int[length];
        for(int i=0;i<length;i++) {
        	Arr[i]=scanner.nextInt();
        }
        return Arr;
	}
	public static void Print1dArray(int[] arr) {
		System.out.println();
//		System.out.println("length of array : "+arr.length);
		for(int i=0;i<arr.length;i++) {
//			System.out.println("A["+i+"] : "+arr[i]);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void Print2dArray(int[][] arr) {
		System.out.println();
		System.out.println("length of array : "+arr.length);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] s=new int[9];
		for(int i=0;i<5;i++) {
			s[i]=TakeInt();
		}
		Print1dArray(s);
	}
}
