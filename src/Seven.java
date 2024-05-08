import java.util.Stack;

public class Seven {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        System.out.println("Stack1 перед обменом: " + stack1);
        System.out.println("Stack2 перед обменом: " + stack2);

        Stack<Integer> tempStack = stack1;
        stack1 = stack2;
        stack2 = tempStack;

        System.out.println("Stack1 после обмена: " + stack1);
        System.out.println("Stack2 после обмена: " + stack2);
    }
}
