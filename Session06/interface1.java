import java.util.*;


//No Multiple Inheritence 

	interface Car
	{
		int maxSpeed=150;
		
		
		
		public  void turnRight();
		
		public  void turnLeft();
		
		public void reverse();
		
			
		
	
	}

	class BMW implements Car{
		
		
		
		public  void turnRight()
		{
			System.out.println("To");
		}
		
		public void turnLeft()
		{
			
			
		}
		
		public void reverse()
		{
			
		}
	}


	class interface1

	{
	
	
	
	
		public static void main(String args[])
		{
			Car a=new BMW();
			
			a.turnRight();
			
			
			
			
		}
	
	
	
	
	}