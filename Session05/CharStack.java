import java.util.*;

class CharStack {

	private char[] stack;
	public int top;
	public int SIZE;

	CharStack(int maxCapacity){
		stack = new char[maxCapacity];
		top = -1;
		this.SIZE = stack.length;
	}

	char pop() {
		if(top > 0){
			char temp = stack[top];
			stack[top--] = Character.MIN_VALUE;
			return temp;
		} else {
			return Character.MIN_VALUE;
		}
	}


	void push(char c){
		if(top < (stack.length-1)){
			stack[++top] = c;
		} else {
			System.out.println("Stack is full");
		}
	}

	char peek(){
		if(top > 0){
			return stack[top];
		} else {
			return Character.MIN_VALUE;
		}
	}


	boolean isEmpty(){
		if(top <= 0){
			return true;
		}

		return false;
	}


	boolean isFull(){
		if(top == stack.length-1){
			return true;
		}

		return false;
	}
	void printStack(){
		System.out.println(Arrays.toString(stack));
	}
}

class Main {

	public static void main(String[] args) {
		CharStack c = new CharStack(5);
		System.out.println("isEmpty : " + c.isEmpty());
		c.push('h');
		c.push('e');
		c.push('l');
		c.push('l');
		c.push('o');

		c.printStack();

		System.out.println("isFull : " + c.isFull());
		System.out.println("Pop : " + c.pop());
		System.out.println("Peek : " + c.peek());
		System.out.println("Size : " + c.SIZE);
	}


}