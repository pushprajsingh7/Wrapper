import java.util.*;

/**
 * program to Reverse an arrayList using a Stack
 * 
 * @author ss
 *
 */

public class ReverseArrayList {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		int size;
		int i;
		for ( i = 0; i <= 5; i++) {
			list.add(i);
		}
		System.out.println(list);
		Stack<Integer> stack = new Stack<Integer>();
		for ( i = 0; i < list.size(); i++) {
			stack.push(i);
		}
		System.out.println(stack);
		size = stack.size();
		System.out.println("size of stack is :"+stack.size());
		list.clear();
		System.out.println(list);
		
		for ( i = 0; i < size; i++) {
			list.add(stack.pop());
		}
		System.out.println(list);

	}
}
