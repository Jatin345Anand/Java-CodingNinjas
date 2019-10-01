package Recursion;

public class PairStar {
	static String ans="";
	public static String addStars(String S) {
		 if(S.length()==0){
			   return "";
		   } 
		   if(S.length()==1 && S.charAt(0)!='i') {
			   
//			   ans= ans+S;
			   return S;
		   }
		   System.out.println(S.charAt(0)+"   "+S+"  "+ans);
		   if(S.length()>1) {
			   if(S.charAt(0)==S.charAt(1)) {
					   
//				   ans = ans+S.charAt(0)+"*";
				   return S+S.charAt(0)+"*";
//				   S = S.substring(1, S.length());
			   }
			   else {
////				   if(S.charAt(0)!='i')
//				   ans = ans +S.charAt(0);
				   return S+S.charAt(0);
			   }
		   }
		  
//		   addStars(S.substring(1));
		   
	       return addStars(S.substring(1));
	}
	public static void main(String[] args) {
		String S = TakeData.TakeString();
		System.out.println("Ans : "+addStars(S));
	}
}
