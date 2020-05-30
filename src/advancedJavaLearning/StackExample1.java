package advancedJavaLearning;

import java.util.*;

public class StackExample1 {
    public static void main(String[] args) {
        //Stackas, pringles dezute, leksciu kruva
        Stack<Integer> stack = new Stack<>();
        System.out.println("Is stack empty? - " + true);
        stack.push(1001);
        stack.push(1002);
        stack.push(1003);
        stack.push(1004);
        System.out.println(stack);
        System.out.println("Pop operation..." + stack.pop());
        System.out.println(stack);
        System.out.println("Stack search operation... Found at index - " + stack.search(1002));
        System.out.println("Lets peek the stack " + stack.peek());
        System.out.println("Stack after peek looks like that - " + stack);
        System.out.println("Is stack empty? - " + stack.isEmpty());
    }
}
