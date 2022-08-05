import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//import java.util.*;

/**
 * program to learn arraylists of wrapper class
 *
 * @author ss
 *
 */
public class Arraylist {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(1);
		System.out.println("Arraylist is: "+list);
		list.remove(2);
		System.out.println("Arraylist is: "+list);
		list.add(2,3);
		System.out.println("arraylist after adding an element is :"+list);
		int element = list.get(1);
		
		System.out.println("element  is : " + element);
		Set<String> set = new HashSet<String>();
		System.out.println(set.add("first"));
		set.add("first");
		set.add("second");
		set.add("third");
		set.add("first");
		set.add("first");
		set.add("first");
		System.out.println(set.add("first"));
		System.out.println("HashSet is: " + set);
		Set<String> linkedset = new LinkedHashSet<String>();
		linkedset.add("one");
		linkedset.add("two");
		linkedset.add("three");
		linkedset.add("one");
		System.out.println("LinkedhashSet is : " + linkedset);
		Set<Integer> treeset = new TreeSet<Integer>();
		treeset.add(3);
		treeset.add(3);
		treeset.add(2);
		treeset.add(1);
		treeset.add(1);
		System.out.println("TreeSet is : " + treeset);

	}
}
