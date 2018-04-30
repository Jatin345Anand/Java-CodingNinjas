package pod;

import java.util.Scanner;

public class CountOFPlates {
	public static boolean table(int n,int R,int r)
	{
      boolean flag=false;
      if(n==2) {
    	  if(R==2*r) {
    		flag=true;  
    	  }
      }
      else if(n%2==0) {
    	  int X=(2*R)-(4*r);
    	  System.out.println("X = "+X+"  n= "+n+" X-n ="+(X-n));
        
    	  if(n==X) {
    		  flag=true;
    	  }
      }
      else if(n%2!=0) {
    	  int x=(2*R)-(4*r);
     	 System.out.println(x);
    	int X=(R/2)-r;
     	System.out.println("X = "+X+"  n= "+n+" X-n ="+(X-n));
       }
      else if(n==1) {
    	  if(R==r) {
    		  flag=true;
    	  }
      }
      return flag;
	}

	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int n=scanner.nextInt();
	  int R=scanner.nextInt();
	  int r=scanner.nextInt();
	  System.out.println(table(n,R,r));
	  scanner.close();
	}

}
