
public class solution {
	
	public static void printSequence(int range){
	   if(range<2) {
			   return ;
		   }
		   if(range<5) {
			   System.out.println("2");
			   return ;
		   }
		   String[] Ans = {"2","5"};
		   printHelper(range,Ans);
	   
	}
  	   public static void  printHelper(int n,String[] Result) {
		   int x=2;
		   String[] NewResult =new String[Result.length*3];
		   int k=0;
		   for(int i=0;i<Result.length;i++) {
			   NewResult[k++]=Result[i];
		   }
		   for(int j=0;j<2;j++,x=5) {
			   for(int i=Result.length/3;i<Result.length;i++) {
				   if(Integer.parseInt(NewResult[k-1])>n) {
					   printstr(NewResult,k-1);
					   return;
				   }
				   NewResult[k++]=x+Result[i];
			   }
		   }
		   printHelper(n,NewResult);
	   }
	   public static void printstr(String[] Str,int l) {
		   for(int i=0;i<l;i++) {
			   System.out.println(Str[i]);
		   }
	   }
}
