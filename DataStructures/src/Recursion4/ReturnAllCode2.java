package Recursion4;

import Recursion.TakeData;

public class ReturnAllCode2 {
	public static boolean isIntSingle(String i) {
		int intCode = i.charAt(0);
//		System.out.println(intCode);
		if(intCode>=48 && intCode<=57) {
			return true;
		}
		return false;
	}
	public static boolean isInt(String i) {
		int intCode1 = i.charAt(0);
		int intCode2 = i.charAt(1);
		boolean ans1=false;
		boolean ans2=false;
//		System.out.println(intCode1+" "+intCode2);
		if(intCode1>=48 && intCode1<=57) {
			ans1 = true;
		}
		if(intCode2>=48 && intCode2<=57) {
			ans2 = true;
		}
		return ans1 && ans2;
	}
	public static String[] getcode(String input) {
		if(input.length()==0) {
			String[] ans= {""};
			return ans;
		}
		String[] Firstans  = {} ;
		String[] Secondans = {} ;
		if(isIntSingle(input.charAt(0)+"")) {
			Firstans  = getcode(input.substring(1));
		}
		if(input.length()>=2 && isInt(input.substring(0, 2))) {
			if(Integer.valueOf(input.substring(0, 2))>10 && Integer.valueOf(input.substring(0, 2))<27) {
				Secondans = getcode(input.substring(2));
			}	
		}
		
		String[] bigans = new String[Firstans.length+ Secondans.length];
		int k=0;
		for(int i=0;i<Firstans.length;i++) {
			int ir = 'a';
			int it= Integer.valueOf(input.charAt(0)+"");
			System.out.println("ir - it "+ir+" - "+it);
			int ansi = it+ir-1;
			bigans[k++] =  (char)ansi+Firstans[i];
		}
		for(int i=0;i<Secondans.length;i++) {
			bigans[k++] = (char)(Integer.valueOf(input.substring(0, 2))+'a'-1)+ Secondans[i];
		}
		return bigans;
	}
//	abcdefh
//	awdefh
//	lcdefh

public static void main(String[] args) {
	String input = TakeData.TakeString();
//	System.out.println(isInt(input));
//	System.out.println(isIntSingle(input));
	TakeData.Print1dStringArray(getcode(input));
}
}
