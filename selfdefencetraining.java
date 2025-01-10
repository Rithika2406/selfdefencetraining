import java.util.*;
import java.lang.*;
import java.io.*;class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
		    int count=0;
		    int n=sc.nextInt();
		    for(int i=0;i<n;i++){
		        int a=sc.nextInt();
		        if(a>=10 && a<=60)
		            count++;
		    }
		    System.out.println(count);
		    t--;
		}
		sc.close();
	}
}