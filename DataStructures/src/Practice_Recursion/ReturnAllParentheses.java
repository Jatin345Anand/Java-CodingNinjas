public class solution {
	
 public static String[] findParenthesis(int n){
	 if(n==1) {
		 String[] ans = {"()"};
		 return ans;
	 }
     if(n==0){
         String[] ans = {""};
         return ans;
     }
    	 
		String[] smallans = findParenthesis(n - 1);
		String[] bigans = new String[(3 * smallans.length) - 1];
		int k = 0;
		for (int i = 0; i < smallans.length; i++) {
			bigans[k++] = "(" + smallans[i] + ")";
			
		}
		for (int i = 0; i < smallans.length-1; i++) {
			bigans[k++] = smallans[i] + "()";
			bigans[k++] = "()" + smallans[i];
		
			 	
		}
//		bigans[k++] = "(" + smallans[smallans.length - 1] + ")";
		bigans[k++] = smallans[smallans.length - 1]+"()";
		return bigans;
	}
 
}


