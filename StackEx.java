import java.util.*;

public class StackEx {
	public static void main(String[] args)
    {
 
        Stack stack1 = new Stack();
  
        Stack<String> stack2 = new Stack<String>();

        stack1.push(1);
        stack1.push(2);
        stack1.push("Three");
  
        stack2.push("blucursor1");
        stack2.push("blucursor2");
        stack2.push("blucursor3");
  
        System.out.println(stack1);
        System.out.println(stack2);
        stack1.pop();
        System.out.println(stack1);
        stack2.pop();
        System.out.println(stack2);
    }
}

