/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		if(n<=k){
			System.out.println("1");
			System.exit(0);
		}
		int mod=1000000007;
		int fibNum[]=new int[n+1];
		int i=1;
		fibNum[0]=0;
		int sum=k,preSum=0;
		while(i<=k){
			fibNum[i]=1;
			++i;
		}
		while(i<=n){
			fibNum[i]=(sum-preSum+mod)%mod;
			sum=(sum+fibNum[i])%mod;
			preSum=(preSum+fibNum[i-k])%mod;
			i++;
		}
		System.out.println(fibNum[n]);
		// for(i=0;i<=n;i++){
		// 	System.out.print(fibNum[i]+" ");
		// }
	}
}
