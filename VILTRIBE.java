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
			String s=sc.next;
			int l=s.length();
			boolean Astart=false,Bstart=false;
			int Acount=0,Bcount=0,dot=0;
			for(int i=0;i<l;i++){
				if(s.charAt(i)=='A'){
					if(Astart==true){
						Acount+=dot+1;
						dot=0;
					}						
					else{
						Acount+=1;
						Astart=true;
						Bstart=false;
						dot=0;
					}						
				}
				else if(s.charAt(i)=='B'){
					if(Bstart==true){
						Bcount+=dot+1;
						dot=0;
					}
					else{
						Bcount+=1;
						Bstart=true;
						Astart=false;
						dot=0;
					}						
				}
				else
					dot++;
			}
			System.out.println(Acount+" "+Bcount);
		}
	}
}
