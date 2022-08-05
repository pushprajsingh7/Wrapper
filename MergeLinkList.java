import java.util.*;

/**
 * program to merge two linked list
 * 
 * @author ss
 *
 */
public class MergeLinkList {
	public static void main(String args[]) {
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		System.out.println(list2);
		List<Integer> list3 = new LinkedList<Integer>();
		for (int i = 0; i <= list1.size() - 1; i++) {
			list3.add(list1.get(i));
		}
		for (int i = 0; i <= list2.size() - 1; i++) {
			list3.add(list2.get(i));

		}
		System.out.println(list3);
	}
}
