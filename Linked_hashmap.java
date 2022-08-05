import java.util.*;

/**
 * program to learn working of linked hashmaps in java
 * 
 * @author ss
 *
 */
public class Linked_hashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> Linked = new LinkedHashMap<Integer, String>();
		Linked.put(28, "MMA");
		Linked.put(3000, "Boxing");
		Linked.put(1532, "jiujutsu");
		Linked.put(15000, "Wrestling");
		System.out.println(Linked.get(3000));
		System.out.println(Linked);
	
	}

}
