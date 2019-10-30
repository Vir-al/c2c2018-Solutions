
import java.util.*;

 class Balloon 
 {
	 String color;
	 
	 Balloon(String a)
	 {
		 
		 color=a;
	 }
	 
	 
 }
 
 class modify {
  
  
  
  public static void  mod(Balloon no)
  {
    
	//no=new Balloon("Blue");
		no.color="blue";
   
  }
  
  public static void main(String[] args) {
	
    
		Scanner sc=new Scanner(System.in);
	//	int n=5;
		Balloon b1=new Balloon("Red");
		
	
		mod(b1);
   
		System.out.println(b1.color);
   
	//	System.out.println(n);
      
	  
	  String s1="ABC";
	  String s2="ABC";
	  
	  System.out.println(s1==s2);				//True  Because of String Pool
	  
	  System.out.println(s1.equals(s2));         //True Since same Content 
	  
	  
	  
	  String a=new String("DEF");				
    
	  String b=new String("DEF");
	  
	   System.out.println(a==b);				//False Two New Objects	
	  
	  System.out.println(a.equals(b));			//True Contents are same
	  
	  
	 
  }
  
  
}

