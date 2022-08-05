import java.util.*;

/**
 * program to learn hash maps in java data structures
 * 
 * @author ss
 *
 */
public class Hash_Maps {
	public static void main(String args[]) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(28,"MMA");
		hash_map.put(3000, "Boxing");
		hash_map.put(1532, "jiujutsu");
		hash_map.put(15000, "Wrestling");
		hash_map.put(28, "abc");
		hash_map.put(null,"MMA");
		hash_map.put(1, null);
		hash_map.put(2, null);
		hash_map.remove(28);
		System.out.println(hash_map.keySet());
		//System.out.println(hash_map.get(28));
		System.out.println(hash_map.get(30));
		System.out.println(hash_map.entrySet());
		
	}
}
