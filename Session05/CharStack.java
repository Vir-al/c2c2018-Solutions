class CharStack {
    private final static int MAX = 100;
    private char[] arr;
    private int top;

    CharStack() {
        arr = new char[MAX];
        top = -1;
    }

    public final char pop() {
        if(isEmpty()) {
            System.out.println("Error: Underflow!");
            System.exit(1);
        }

        char t = arr[top];
        arr[top] = '\u0000';
        top--;
        return t;
    }

    public final void push(char c) {
        if(isFull()) {
            System.out.println("Error: Overflow!");
            System.exit(1);
        }
    
        top++;
        arr[top] = c;
    }

    public final char peek() {
        if(isEmpty()) {
            System.out.println("Error: Empty Stack!");
            System.exit(1);
        }
        
        return arr[top];
    }

    public final boolean isEmpty() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean isFull() {
        if(top == MAX - 1) {
            return true;
        } else {
            return false;
        }
    }
}