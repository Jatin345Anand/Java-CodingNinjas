package pod;

import java.util.HashSet;
import java.util.Scanner;

public class HElloString2 {

 	 public static boolean checkHello(String s) {
	    boolean flag=true;
		 		HashSet<Character> HSc= new HashSet<>(	);
	 		char[] cArray =s.toCharArray();
	 		 	
	 		 	for(char c :cArray) {
			 		if(c>=97 && c<=122 && (c=='h' || c=='o' || c=='l' || c=='e'))
	 		  		HSc.add(c);
	 		}
	 		 
	 		 	 if(s.length()>5 && HSc.size()==4){
	             }
	            else {
	            	flag =false;
	            } 
		 		return flag;
		}
 	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
		String s= scanner.next();
	     System.out.println(checkHello(s));
	  	scanner.close();
	}
	}


