
import java.util.*;
import java.io.*;



class Msort
{


	public static void main(String[] args)
	{
			
			Scanner sc=new Scanner(System.in);
			
			
			int n=sc.nextInt();
			int m=sc.nextInt();
			ArrayList<Integer> a1=new ArrayList();
			ArrayList<Integer> a2=new ArrayList();
			
			for(int i=0;i<n;i++)
			{
					a1.add(sc.nextInt());
			}		
			
			
			for(int i=0;i<m;i++)
			{
					a2.add(sc.nextInt());
			}		
			
			a1.addAll(a2);
			
			Collections.sort(a1);
			
			
		   Integer[] a=a1.toArray();
			
			
			System.out.println(a);
	}


}