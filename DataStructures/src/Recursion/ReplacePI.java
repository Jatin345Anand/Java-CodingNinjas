package Recursion;

public class ReplacePI {
	static String ans="";
	public static String replace(String S) {
	   if(S.length()==0){
		   return "";
	   } 
	   if(S.length()==1 && S.charAt(0)!='i') {
		   
		   ans= ans+S;
	   }
	   System.out.println(S.charAt(0)+"   "+S+"  "+ans);
	   if(S.length()>1) {
		   if(S.charAt(0)=='p' && S.charAt(1)=='i') {
				   
			   ans = ans+"3.14";
			   S = S.substring(1, S.length());
		   }
		   else {
//			   if(S.charAt(0)!='i')
			   ans = ans +S.charAt(0);
		   }
	   }
	  
	   replace(S.substring(1));
	   
       return ans;
	}
//	pippiippip
//	3.14p3.14ip3.14p
//	3.14p3.14ip3.14p
//	dggsdgisdgdspisspi
//	dggsdgisdgds3.14ss3.14
//	dggsdgisdgds3.14ss3.14
//	dggsdgisdgds3.14ss3.14
//	dggsdgsdgds3.14ss3.14i  my
	
//	sfadsdpifbfbfsfbspisfpipipi
//	sfadsd3.14fbfbfsfbs3.14sf3.143.143.14
//	sfadsd3.14fbfbfsfbs3.14sf3.143.143.14
//	sfadsd3.14fbfbfsfbs3.14sf3.143.143.14
//	sfadsd3.14fbfbfsfbs3.14sf3.143.143.14i  my
	public static void main(String[] args) {
       String S = TakeData.TakeString();
      System.out.println("Ans : "+ replace(S));
	}
}
