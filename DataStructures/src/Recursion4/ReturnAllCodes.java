package Recursion4;

import Recursion.TakeData;

public class ReturnAllCodes {

	public static String GetCharfromInt(String i) {

		int i1 = Integer.valueOf(i);

		char C = (char) (i1 + 'a' - 1);
		return String.valueOf((char) C);
	}

	public static String isStringValidforCodes(String input) {
		String ans = "";
		String[] allStrings = input.split(",");
//		System.out.println("Splited array...");
//		TakeData.Print1dStringArray(allStrings);
		boolean isValidString = true;
		for (int i = 0; i < allStrings.length; i++) {
			if (allStrings[i].length() > 0) {
//				System.out.println("String is "+allStrings[i]+ "  "+allStrings[i].length());
				if (Integer.valueOf(allStrings[i]) < 1 || Integer.valueOf(allStrings[i]) > 26) {
					isValidString = false;
				}
			}

		}
//		System.out.println("IS string is valid "+isValidString);
		if (isValidString == true) {
//			System.out.println("Yes this is valid "+allStrings.length);
			for (int j = 0; j < allStrings.length; j++) {
//				System.out.println(allStrings[j]);
				if (allStrings[j].length() > 0)
					ans = ans + GetCharfromInt(allStrings[j]);
//				System.out.println("ans : "+ ans +" code : "+allStrings[j]+" coded ans : "+GetCharfromInt(allStrings[j]));
			}
		}
//		System.out.println("Coded String : "+ans);
		return ans;
	}

	public static String CreateFirstString(String Previous, String StartingChar) {
		return StartingChar + "," + Previous;
	}

	public static boolean isIntSingle(String i) {
		int intCode = i.charAt(0);
//		System.out.println(intCode);
		if (intCode >= 48 && intCode <= 57) {
			return true;
		}
		return false;
	}

	public static boolean isInt(String i) {
		int intCode1 = i.charAt(0);
		int intCode2 = i.charAt(1);
		boolean ans1 = false;
		boolean ans2 = false;
//		System.out.println(intCode1+" "+intCode2);
		if (intCode1 >= 48 && intCode1 <= 57) {
			ans1 = true;
		}
		if (intCode2 >= 48 && intCode2 <= 57) {
			ans2 = true;
		}
		return ans1 && ans2;
	}

	public static String[] getCode(String input) {
		if (input.length() == 0) {
// 			String[] ans = new String[0];
			String[] ans = { "" };
			return ans;
		}
// 		char c=(char) Integer.parseInt(input);
// 		for(int i=122-25;i<=122;i++) {
// 			c=(char) i;
// 			System.out.println(c);
// 			 			
// 		}
// 		
		String[] smallans = getCode(input.substring(1));
// 		String[] bigans  = new String[1+(2*smallans.length)];
		String[] bigans;
		String FinalAns[] = null;
		if (input.length()>=2 && isInt(input.substring(0, 2))) {
			
			bigans = new String[1 + (2 * smallans.length)];
			int k = 0;
			String FirstChar = input.charAt(0) + "";
			 
				bigans[k++] = FirstChar + "," + smallans[0];
				for (int i = 1; i < smallans.length; i++) {
				
					bigans[k++] = FirstChar + "," + smallans[i];
			
					bigans[k++] = FirstChar + smallans[i].charAt(0) + "," + smallans[i].substring(1);
					
				}
				FinalAns = new String[k];
				int k2 = 0;
				for (String s : bigans) {
					if (s != null)
						FinalAns[k2++] = s;
				}
	
			
			
		}
		if(isIntSingle(input.charAt(0) + "")){
			bigans = new String[(2 * smallans.length)];
			int k = 0;
			String FirstChar = input.charAt(0) + "";
			 
				for (int i = 0; i < smallans.length; i++) {
					bigans[k++] = FirstChar + "," + smallans[i];
					if (smallans[i].length() > 0) {
						bigans[k++] = FirstChar + smallans[i];
					}

				}
				FinalAns = new String[k];
				int k2 = 0;
				for (String s : bigans) {
					if (s != null)
						FinalAns[k2++] = s;
				}

			}
//	 		bigans[k++] = FirstChar+","+smallans[0];
		

		return FinalAns;
	}

	public static void main(String[] args) {
		String input = TakeData.TakeString();
		System.out.println("Final Ans...");
		String[] ans = getCode(input);
		String[] finalans = {};
		int k = 1, j = 0;
//	    String tempstring="";
//	    for(int i=0;i<ans[0].length();i=i+2) {
////	    	System.out.println(ans[0].charAt(i)+'a'-1);
////	    	System.out.println((char)(ans[0].charAt(i)+'a'-1));
//	    	tempstring = tempstring+(char)(ans[0].charAt(i)+'a'-1);
////	    	int i1 = Integer.valueOf(ans[0].charAt(i)+"");
////	    	System.out.println("i1  = "+i1+" char code : "+(i1+'a'-1));
//	    }
//	    finalans[0] = tempstring;
//	    TakeData.Print1dStringArray(finalans);

		System.out.println("Another Final Ans...");
		for (int i = 0; i < ans.length; i++) {
			String tempString = isStringValidforCodes(ans[i]);
			if (tempString.length() > 0) {
				j++;
			}
		}
		finalans = new String[j];
		int x = 0;
		for (int i = 0; i < ans.length; i++) {
			String tempString = isStringValidforCodes(ans[i]);
			if (tempString.length() > 0) {
				finalans[x++] = tempString;
			}
		}
		TakeData.Print1dStringArray(finalans);
//		TakeData.Print1dArray(getCode(input));;
	}

}
