
import java.util.*;

class Diffarray
{



public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");

		int t=sc.nextInt();
		
		System.out.println("Enter array");
		
		int arr[]=new int[t];
		int sol[]=new int[t];
		for(int i=0;i<t;i++)
		{
			arr[i]=sc.nextInt();
		
			
		}
		int j=0;
		
		for(int i=0;i<t;i++)
		{
			if(arr[i]%2==1)
			{	sol[j]=arr[i];
				j++;
		
		
			}
		
		}
		
		for(int i=0;i<t;i++)
		{
			if(arr[i]%2==0)
			{	sol[j]=arr[i];
				j++;
		
		
			}
		
		}
		
		
		for(int i=0;i<t;i++)
		{
			System.out.print(sol[i]+" ");
			
		}
	


	}





}