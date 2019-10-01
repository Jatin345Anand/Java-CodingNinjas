package Recursion3;

import Recursion.TakeData;

public class CheckAB {
     
	public static boolean checkAB(String input) {
		if (input.length() <= 0) {
			return true;
		}
		if (input.length() == 1 && input.charAt(0) == 'a') {
			System.out.println("Only 1");
//			ans = true;
			return true;

		}
		else {
			System.out.println(input);
//			if(input.charAt(0)=='a' && input.length()>3) {
//				if(input.charAt(1)=='a') {
//					return true;
//				}
//				if(input.charAt(1)=='b' && input.charAt(2)=='b') {
//					return true;
//				}
//				else {
//					return false;
//				}
//			}
			if(input.charAt(0)=='a') {
				if(input.length()>=2) {
					System.out.println("Greater 2");
					if (input.substring(0,2).equalsIgnoreCase("aa")) {
//						ans = true;
						return checkAB(input.substring(1));
					}
				}
				if(input.length()>=3) {
					System.out.println("Greater 3");
					if (input.substring(0,3).equalsIgnoreCase("aaa") || input.substring(0,3).equalsIgnoreCase("abb")) {
//						ans = true;
						return checkAB(input.substring(3));
					}
				}
			
//				if(input.length()>=1) {
//					System.out.println("Greater 1");
//					if (input.substring(0,2).equalsIgnoreCase("aa")) {
////						ans = true;
//						return true;
//					}
//				}
			}

		}

		//		if (input.length() == 3) {
//			
//
//		}
//		if (input.length() == 2) {
//			if (input.equalsIgnoreCase("aa")) {
//				return checkAB(input.substring(2));
//			}
//
//		}
//		checkAB(input.substring(1))
		return false;
	}

	public static void main(String[] args) {
		String S = TakeData.TakeString();
		System.out.println("Ans : " + checkAB(S));
	}
}
