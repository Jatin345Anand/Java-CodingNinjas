package Recursion;

public class ReplaceX {
	static String ans="";
	public static String removeX(String S){
      if(S.length()==0) {
    	  return "";
      }
       
      if(S.charAt(0)!='x') {
    	  ans = ans+S.charAt(0);
      }
      System.out.println(S.charAt(0)+"  "+S+"  "+ans);
      removeX(S.substring(1));
      return ans;
	}
	
//	pxxp
//	pp
	
//	aaaxxx
//	aaa
	
//	xxxxxss
//	ss
	public static void main(String[] args) {
		String S = TakeData.TakeString();
		System.out.println("Ans : "+removeX(S));
	}
}
