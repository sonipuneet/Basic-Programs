package chapter3;

public class MinStack {

    // Min stack problem  - function should return minimum element from the stack

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of the stack

    // Method to check if the stack is empty return True.
    public boolean isEmpty() {
        return (top < 0);
    }

    MinStack() {
        top = -1;
    }

    // To enter the values in stack
    public boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + ": " + "Value pushed into stack");
            return true;
        }
    }


    // To get the value from top of the stack
    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    // To remove the values from the stack
    public int pop() {
        if (top < 0) {
            // Nothing is left in the stack
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }


    public int getMin() {
        int res = a[0];

        for (int i = 1; i < a.length; i++) {
            res = Math.min(res, a[i]);
        }
        System.out.println("\nMin Value is :" + res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println("----------------To find the Minimum value in stack---------------- \n");

        MinStack ms = new MinStack();
        ms.push(10);
        ms.push(15);
        ms.getMin();
        ms.push(20);
        ms.push(31);
    }
}
