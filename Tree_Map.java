import java.util.*;

/**
 * program to understand working of tree map in java
 * 
 * @author ss
 *
 */
public class Tree_Map {
	public static void main(String[] args) {
		TreeMap<Integer, String> numbers = new TreeMap<>();
		numbers.put(4, "Two");
		numbers.put(2, "Four");
		numbers.put(3, null);
		//numbers.put(3,"nabc");
		//numbers.put(null, "Five");
		System.out.println("TreeMap of numbers: " + numbers);
	
	}
}
