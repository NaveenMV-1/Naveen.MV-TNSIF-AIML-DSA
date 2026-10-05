public class Stack {

    static int[] stack = new int[100];

    static int top = -1;

    static void push(int value) {

        top++;

        stack[top] = value;
    }

    static void pop() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        top--;
    }
    
    static int getTop() {

        return stack[top];
    }

    static int getMin() {

        int min = stack[0];

        for (int i = 1; i <= top; i++) {

            if (stack[i] < min) {
                min = stack[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        push(5);
        push(3);
        push(7);
        push(2);

        System.out.println("Top: " + getTop());

        System.out.println("Minimum: " + getMin());

        pop();

        System.out.println("Minimum after pop: " + getMin());
    }
}