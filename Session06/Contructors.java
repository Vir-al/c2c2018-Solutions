import java.util.*;


//No Multiple Inheritence 

	class Parent
	{

		Parent(String s)
		{
			System.out.println("Parent");
		}


	}
	
	class Child extends Parent
	{
		
		
		
		
		
		Child(String s)
		{
			super("Str");
			
			 System.out.println("Child"+ s);
		}
		
	}
	
	



	class Contructors

	{
	
	
	
	
		public static void main(String args[])
		{
			Child a=new Child("Hello");
			
			
			
			
			
			
		}
	
	
	
	
	}