import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    StringBuilder ans = new StringBuilder("");
	    while(n!=0)
	    {
	       if(n%2==1)
	       {
	          ans.append("1");
	       }
	       else{
	         ans.append("0");
	       }
	       n = n/2;
	    }
	    
	    System.out.println(ans.reverse());
	}
}
