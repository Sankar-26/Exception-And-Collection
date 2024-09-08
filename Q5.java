import java.util.Stack;

public class Q5 {

    //Stack collection class to store integers.
    static Stack<Integer> stack = new Stack<>();

    //Method to push an element to the stack
    public static void push(int x) {
        stack.push(x);
    }

    //Method to pop an element from the stack
    public static void pop() {
        stack.pop();
    }

    //Method to check if the stack is empty
    public static boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        //Pushing elements to the stack
        push(5);
        push(2);
        push(10);
        push(1);

        System.out.println("After Pushing values to the Stack: " + stack);

        //popping an element from the stack
        pop();
        System.out.println("After Popping a value the Stack: " + stack);

        //Checking if the stack is empty
        System.out.println("Is the Stack Empty: " + isEmpty());

    }
}
