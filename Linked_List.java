import java.util.*;

/**
 * program to learn linkedlists/queue of wrapper class
 * 
 * @author ss
 *
 */
public class Linked_List {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		System.out.println("original list is :" + list);
		list.add(2, 3);
		System.out.println(" list after adding an element is :" + list);
		int element = list.get(2);
		System.out.println("element is : " + element);
		System.out.println("elements removed is :" + list.remove(2));
		System.out.println("Linked list now  is :" + list);	
		Queue<String> queue = new LinkedList<String>();
		queue.add("Elements");
		queue.add("of");
		queue.add("queue");
		System.out.println("queue is :" + queue);
		queue.remove();
		System.out.println("queue after FIFO removal  is :" + queue);
	}

}
