import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
			int n=sc.nextInt();
			int arr[]=new int[n];
			int fMax=Integer.MIN_VALUE,sMax=Integer.MIN_VALUE,fMaxCount=0,sMaxCount=0;
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				if(arr[i]>fMax){
					sMax=fMax;
					sMaxCount=fMaxCount;
					fMax=arr[i];
					fMaxCount=1;
				}
				else if(fMax==arr[i])
					fMaxCount++;
				else if(arr[i]>sMax){
					sMax=arr[i];
					sMaxCount=1;
				}
				else if(arr[i]==sMax)
					sMaxCount++;
			}

			int num,denom;
			double ans;
			if(fMaxCount==1)
				num=sMaxCount;
			else
				num=nCr(fMaxCount,2);
			denom=nCr(n,2);
			ans=(num * 1.0)/denom;
			System.out.printf("%.8f\n", ans);
		}
	}
	public static int nCr(int n, int r) {
    if(n<r) return 0;
    if(n-r < r)
                r = n-r;
    if(r == 0)
                return 1;
    return n*nCr(n-1, r-1)/r;
	}
}
