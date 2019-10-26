
import java.util.*;
import java.io.*;



class Unique
{




public static void main(String[] args) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		String s=br.readLine();
		String[] str=s.split(" ");
		
		SortedSet<String> hs=new TreeSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			hs.add(str[i]);
		}
		
		System.out.println(hs);
		
		
	}




}