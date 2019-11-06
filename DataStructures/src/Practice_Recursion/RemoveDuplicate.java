public class Solution
{
    public static String helper(String s,String d)
    {
      if(s.length()==0)
      {
        return d;
      }
      char Currentchar=s.charAt(0);
       d=d+Currentchar;
      while(s.length()!=0 && Currentchar==s.charAt(0))
      {
        s=s.substring(1);
      }
      return helper(s,d);
    }
  
	public static String removeConsecutiveDuplicates(String s) 
    {
        return helper(s,"");
	}

}
