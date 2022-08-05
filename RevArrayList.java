import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
public class RevArrayList {
		public static void main(String args[]) {
			int size;
			List<Integer> list = new ArrayList<Integer>();
				list.add(1);
				list.add(17);
				list.add(13);
				list.add(7);
				list.add(3);
			System.out.println("list is :"+list);
			//Collections.reverse(list);
			//System.out.println("reverselist through inbuilt function is :"+list);
			Stack<Integer> stack = new Stack<Integer>();
			for(  int stack1:list) {
				stack.push(stack1);			}
			int s=list.size();
			System.out.println("size of list is : "+s);
			list.clear();
			System.out.println("list after clearing is :"+list);
			size=stack.size();
			if(s==size) {
				System.out.println("size of list is :"+s+" \nsize of stack is :"+size);
			}
			else {
				System.out.println("size is not same");
			}
			System.out.println("stack created is : "+stack);
			for(int i=0;i<s;i++) {
				list.add( stack.pop());
			}
			System.out.println(list);

		}
	}


