import java.util.*;

class Calculator {

	public static void main(String[] args) {
		int choice;
		double a,b;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("\n\n1 = Addition\n2. Subtraction\n3 = Multiplication\n4 = Division\n5 = Exit\nYour choice :  ");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					//Addition
					System.out.print("\nEnter first number : ");
					a = sc.nextDouble();
					System.out.print("Enter Second number : ");
					b = sc.nextDouble();
					System.out.print("Addition of " + a + " & " + b + " : " + (a+b));
					break;
				case 2:
					// Subtraction
					System.out.print("\nEnter first number : ");
					a = sc.nextDouble();
					System.out.print("Enter Second number : ");
					b = sc.nextDouble();
					System.out.print("Subtraction of " + a + " & " + b + " : " + (a-b));
					break;
				case 3:
					// Multiplication
					System.out.print("\nEnter first number : ");
					a = sc.nextDouble();
					System.out.print("Enter Second number : ");
					b = sc.nextDouble();
					System.out.print("Multiplication of " + a + " & " + b + " : " + (a*b));
					break;
				case 4:
					// Division
					System.out.print("\nEnter first number : ");
					a = sc.nextDouble();
					System.out.print("Enter Second number : ");
					b = sc.nextDouble();
					if(b != 0){
						System.out.print("Division of " + a + " & " + b + " : " + (a/b));
					} else {
						System.out.print("Can't divide by zero!");
					}
					break;
				case 5:
					// Exit
					break;
				default:
					System.out.print("\nPlease enter the choice from above menu!");

			}	
		} while( choice != 5);
	}
}