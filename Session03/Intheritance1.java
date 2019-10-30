import java.util.*;


//No Multiple Inheritence 

	class Parent
	{


		public void mt1()
		{
			System.out.println("In Parent  mEthod1");
			
		}


	}
	
	class Child extends Parent
	{
		
		public void mt1()
		{
			System.out.println("In Child mEthod1");
			
		}
		
	}
	
	



	class Intheritance1

	{
	
	
	
	
		public static void main(String args[])
		{
			Child a=new Child();
			
			a.mt1();
			
			
			Parent b=new Child();
			
			b.mt1();
			System.out.println(a);
			
		}
	
	
	
	
	}