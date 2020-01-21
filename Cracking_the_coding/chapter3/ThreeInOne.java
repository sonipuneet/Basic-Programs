package chapter3;

import java.util.*;
import java.lang.*;

public class ThreeInOne {
    // Implementation of 3 stacks using one single array

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of the stack

    // Method to check if the stack is empty return True.
    public boolean isEmpty() {
        return (top < 0);
    }

    ThreeInOne() {
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

    public void print_stack() {
    }

    public static void main(String[] args) {
        ThreeInOne one = new ThreeInOne();
        one.push(10);
        one.push(15);
        one.push(20);
        one.push(31);

        System.out.println(one.pop() + ": " + "Popped from the stack");
        System.out.println(one.pop() + ": " + "Popped from the stack");
        System.out.println(one.pop() + ": " + "Popped from the stack");

    }
}
