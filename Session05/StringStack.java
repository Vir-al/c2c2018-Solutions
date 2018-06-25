class StringStack {
    private final static int MAX = 100;
    private String[] arr;
    private int top;

    StringStack() {
        arr = new String[MAX];
        top = -1;
    }

    public final String pop() {
        if(isEmpty()) {
            System.out.println("Error: Underflow!");
            System.exit(1);
        }

        String t = arr[top];
        arr[top] = null;
        top--;
        return t;
    }

    public final void push(String s) {
        if(isFull()) {
            System.out.println("Error: Overflow!");
            System.exit(1);
        }
    
        top++;
        arr[top] = s;
    }

    public final String peek() {
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