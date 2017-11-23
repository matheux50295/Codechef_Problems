import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
			int n=sc.nextInt();
			BigInteger b=new BigInteger(Integer.toString(1));
			for(int i=2;i<=n;i++){
				b=b.multiply(new BigInteger(Integer.toString(i)));
			}
			System.out.println(b);
		}
	}
}
