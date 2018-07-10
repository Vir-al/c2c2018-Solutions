import java.util.*;

class StringStack {

	private String[] stack;
	public int top;
	public int SIZE;

	StringStack(int maxCapacity){
		stack = new String[maxCapacity];
		top = -1;
		this.SIZE = stack.length;
	}

	String pop() {
		if(top > 0){
			String temp = stack[top];
			stack[top--] = null;
			return temp;
		} else {
			return null;
		}
	}


	void push(String s){
		if(top < (stack.length-1)){
			stack[++top] = s;
		} else {
			System.out.println("Stack is full");
		}
	}

	String peek(){
		if(top > 0){
			return stack[top];
		} else {
			return null;
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
		StringStack s = new StringStack(3);
		System.out.println("isEmpty : " + s.isEmpty());
		s.push("Hello,");
		s.push("World");
		s.push("!");

		s.printStack();

		System.out.println("isFull : " + s.isFull());
		System.out.println("Pop : " + s.pop());
		System.out.println("Peek : " + s.peek());
		System.out.println("Size : " + s.SIZE);
	}


}