import java.util.*;



class LinkedList
	{

	 Node head;
		public void append(int data ,int index)
		{
			
			Node l=new Node(data);
			
			if(head==null)
			{ 
				head=l;
				
			}
			else
			{
				Node current=head;
				int c=0;
				while(current.next!=null &&c==index)
				{
					
					
				}
				
			}
			
		}
		
		
			public void addfirst(int data)
			{
				Node l=new Node(data);		
				l.next=head;
				head=l;
			}
			
		public void append(int data)
		{
				
			Node l=new Node(data);
			
			if(head==null)
			{ 
				head=l;
			}
			else
			{
				Node current=head;
				
				while(current.next!=null)
				{
					current=current.next;
				}
				
				current.next=l;
				
				
				
			}
			
			
		}

		public void display()
		{
			
			if(head==null)
			{ 
			
				System.out.println("Empty");
			}
			else
			{
				Node current=head;
				
				while(current!=null)
				{
					System.out.print(current.data+" ");
					current=current.next;
					
				}
				
				
				
				
				
			}
			
		}



	}

	class Node
	{

	int data;
	Node next;


		Node(int data)
		{
			this.data=data;
			next=null;
		}

		
	}


	class LinkMain
	{

		public static void main(String[] ar)
		{
			
			LinkedList a=new LinkedList();
			
			a.append(24);
			a.append(27);
			a.addfirst(1);
			a.addfirst(-45);
			
			
			a.display();
			
			
			
				LinkedList b=new LinkedList();
				System.out.println();
				b.addfirst(23);
				b.display();
		}



	}