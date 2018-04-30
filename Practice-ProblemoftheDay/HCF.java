package pod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class HCF {
	public static Vector<Integer> FindDividerV(int n){
		  System.out.println(n);
		 		Vector<Integer> V =new Vector<>();
		 			for(int i=1;i<=n;i++) {
						if(n%i==0) {
							V.add(i);
						}
					}
				return V;
			}
	public static 	LinkedList<Integer > FindDividerLL(int n){
		  System.out.println(n);
		 		LinkedList<Integer > LL = new LinkedList<Integer>();	
					for(int i=1;i<=n;i++) {
						if(n%i==0) {
							LL.add(i);
						}
					}
				return LL;
			}
	public static TreeSet<Integer> FindDividerT(int n){
		  System.out.println(n);
			 	TreeSet<Integer>	TS = new TreeSet<Integer>();	
			 		for(int i=1;i<=n;i++) {
						if(n%i==0) {
							TS.add(i);
						}
					}
				return TS;
			}
	public static 	HashSet<Integer> FindDividerH(int n){
		  System.out.println(n);
			 	HashSet<Integer> HS = new HashSet<Integer>();
			 		for(int i=1;i<=n;i++) {
						if(n%i==0) {
						HS.add(i);
						}
					}
				return HS;
			}
	public static ArrayList<Integer> FindDividerA(int n){
  System.out.println(n);
		ArrayList<Integer> AL= new ArrayList<>();
	 		for(int i=1;i<=n;i++) {
				if(n%i==0) {
					AL.add(i);
					break;
				}
			}
		return AL;
	}
	public static int FindHCF(int A[]) {
		HashSet<Integer> HS = new HashSet<Integer>();
		TreeSet<Integer>	TS = new TreeSet<Integer>();	
		HashMap<Integer,ArrayList<Integer>> HM= new HashMap<>();
		int ans=0;
		 for(int n:A) {
			 HM.put(n, FindDividerA(n));
		 }
		 System.out.println(HM);
		 System.out.println(HM.values()); 
		return ans;
		
	}
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //int n1=scanner.nextInt();
    int n=scanner.nextInt();
//    Long FA=System.currentTimeMillis();
//    System.out.println( FindDividerA(n1));
//    Long SA=System.currentTimeMillis();
//    System.out.println(FA-SA);
////    
//    Long FV=System.currentTimeMillis();
//    System.out.println( FindDividerV(n1));
//    Long SV=System.currentTimeMillis();
//    System.out.println(FV-SV);
//    
//    Long FL=System.currentTimeMillis();
//    System.out.println( FindDividerLL(n1));
//    Long SL=System.currentTimeMillis();
//    System.out.println(FL-SL);
//    
//    Long FT=System.currentTimeMillis();
//    System.out.println( FindDividerT(n1));
//    Long ST=System.currentTimeMillis();
//    System.out.println(FT-ST);
//    
//    Long FH=System.currentTimeMillis();
//    System.out.println( FindDividerH(n1));
//    Long SH=System.currentTimeMillis();
//    System.out.println(FH-SH);
//    
    
    
    int A[]= new int[n];
    
    for(int i:A) {
    	A[i]=scanner.nextInt();
    }
    FindHCF(A);
    scanner.close();
	}

}
