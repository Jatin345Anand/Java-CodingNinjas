package Recursion;

import Recursion.TakeData;

public class Multipication {
	public static int Multiply(int n1, int n2) {
		if (n2 == 1) {
			return n1;
		}
		int smallAns = Multiply(n1, n2 - 1);
		return n1 + smallAns;
	}

	public static int Power(int n1, int n2) {
		if (n2 == 1) {
			return n1;
		}
		int smallAns = Power(n1, n2 - 1);
		return n1 + smallAns;
	}

	public static void main(String[] args) {
		int n1 = TakeData.TakeInt();
		int n2 = TakeData.TakeInt();
		System.out.println("Multipication is " + Multiply(n1, n2));

	}
}
