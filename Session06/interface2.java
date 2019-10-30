import java.util.*;



	interface Electronic
	{
		
		
		
		
		public  void turnOn();
		
		public  void turnOff();
		
	
		
			
		
	
	}

	class Tv implements Electronic {
		
		
		
		public  void turnOn()
		{
			System.out.println("To");
		}
		
		public void turnOff()
		{
			
			
		}
		
		
	}

	abstract class Laptop implements Electronic{
		
		public  void turnOn()
		{
			System.out.println("TV");
		}
		
		
	}

	class interface2

	{
	
	
	
	
		public static void main(String args[])
		{
			Electronic a=new Tv();
			
			Electronic b[]=new Electronic[5];
			
		
			b[0]=new Tv();
			b[1]=new Tv();
			b[2]=new Tv();
			b[3]=new Laptop();
			b[4]=new Laptop();
			
			
			for(Electronic item:b)
			{
				item.turnOn();
			}
			
			
	
			
			
			
		//	a.turnOn();
			
			
			
			
			
		}
	
	
	
	
	}