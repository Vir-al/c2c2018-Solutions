
import java.util.*;
import java.io.*;



class Chessmoves
{




public static void main(String[] args) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		String s=br.readLine();
		String[] str=s.split(" ");
		
		LinkedList<String> hs=new LinkedList<String>();
		String a="";
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("print"))
			{
				System.out.println(hs);
				
			}
			else if(str[i].equals("undo"))
			{
				
				hs.removeLast();
				//hs.remove(a);   if object of List
				
			}
			
			else{
			//	a=str[i];
			hs.add(str[i]);
			}
		}
		
	
		
		
	}




}