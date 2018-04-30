package pod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;
public class HelloString {
	public static void spliter(String s) {
		String S[] = s.split(" ");
		for(String string: S) {
			System.out.println(string);
		}
	}
	public static Character get(int index,HashSet<Character> HSc) {
		java.util.Iterator<Character> iterator = HSc.iterator(); 
         char[] CArray =new char[HSc.size()];
         int x=0;
	      while (iterator.hasNext()) {
	         CArray[x++] = iterator.next();
	      }
	      return CArray[index];
	}
	
	public static boolean checkHello(String s) {
		boolean flag=true;
		HashSet<Character> HSc= new HashSet<>(	);
 		char[] cArray =s.toCharArray();
 		 	
 	//	ArrayList<Character> ALc = new ArrayList<>();	
		 	for(char c :cArray) {
		 		if(c>=97 && c<=122 && (c=='h' || c=='o' || c=='l' || c=='e'))
 		  		HSc.add(c);
 		}
 		 
 		 	 if(s.length()>5 && HSc.size()==4){
            	 
            }
            else {
            	flag =false;
            }/*
		 	ALc2.addAll(HSc);
		 	if(s.length()>5) {
	 		 for(int i=0;i<ALc.size();i++) {
	 			 if(ALc.get(i)=='h' || ALc.get(i)=='o'||  ALc.get(i)=='l'||  ALc.get(i)=='e' ) {
	 				 
	 			 }
	 		 }
	 	 	}
	 		else {
	 			flag=false;
	 		}*/
	 		return flag;
	}
	public static boolean checkHello2(String s) {
		 		boolean flag=true;
		        TreeSet<String > TSs = new TreeSet<>();
		 		TreeSet<Character > TSc = new TreeSet<>();
		 		HashSet<String> HSs= new HashSet<>();
		 		HashSet<Character> HSc= new HashSet<>(	);
		 		char[] cArray =s.toCharArray();
				ArrayList<Character> ALc = new ArrayList<>();	
				 	for(char c :cArray) {
		 		  		ALc.add(c);
		 		}
				 	ALc.forEach((c)->{
				 		System.out.print(c+" ");
				 	});
				 	System.out.println();
		 		TSc.addAll(ALc);
		 		TSc.forEach((c)->
		 		System.out.print(c+" ")
		 				);
		 		
		 		System.out.println("\n$$$$$$$$$$$$$$$$$$");
		 		HSc.addAll(ALc);
		 		System.out.println(HSc.size());
		 		HSc.forEach((c)->{
		 		if(c=='h' || c=='o' || c=='l' || c=='e' )
		 		System.out.print(c+" ");
		 		});
		 		return flag;
		 		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s= scanner.next();
		//System.out.println("%%%%%%%%%%%%%%%%%%%");
		//String str = scanner.nextLine();
	    System.out.println(checkHello(s));
		//spliter(str);
		scanner.close();
	}
}
