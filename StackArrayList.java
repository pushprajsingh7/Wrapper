import java.util.*;

/**
 * Implement Stack (push, pop and isEmpty ) using arrayList
 * 
 * @author ss
 *
 */

public class StackArrayList {
	List<Integer> list = new ArrayList<>();

	void push(int element) {
		list.add(element);
	}
	void printlist() {

		System.out.println(list);

	}

	void pop() {
		if (!list.isEmpty()) {
			int element_to_pop = list.remove(list.size() - 1);
		
			System.out.println("element to be popped is: " + element_to_pop);

			for (int i = list.size(); i <= list.size() - 1; i++) {
				list.remove(i);
			}
			System.out.println(list);

		} else {
			System.out.print("The stack is empty  ");
		}
	}

	boolean isempty() {

		if (list.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String args[]) {
		StackArrayList stack = new StackArrayList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.printlist();
		stack.pop();
		stack.pop();
		System.out.println("is stack empty? : "+stack.isempty());
	}
}