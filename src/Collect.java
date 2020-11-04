import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Collect {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> hash = new HashMap<>();
		// add keys and values to our hashmap
		hash.put("Cat",1);
		hash.put("Dog",2);
		hash.put("Deer",4);
		hash.put("Oyster",4);
		hash.put("Jellyfish",4);
		
		// Print our hashmap
		System.out.println("HashMap:");
		for(Map.Entry<String, Integer> entry : hash.entrySet()) {
			System.out.print(entry.getKey() + entry.getValue() + " ");
		}
		System.out.println();
		
		
		// Create a Hashset and add all values from hash to it
		HashSet<String> hashUnique = new HashSet<>();
		for(Map.Entry<String, Integer> entry2 : hash.entrySet()) {
			hashUnique.add(entry2.getValue() + " ");
		}
		
		System.out.println();
		System.out.println("HashSet:");
		for(String entry3 : hashUnique) {
			System.out.print(entry3 + " ");
		}
		System.out.println();
		System.out.println("Observe that hashUnique only has 1 value of 4 instead of 3 values of 4, only counting the unique elements.");
		
		System.out.println();
		System.out.println();
		System.out.println("TreeMap:");
		// Create a TreeMap
		TreeMap<String,Integer> tree = new TreeMap<>();
		// Add all values of our HashMap to our TreeMap
		tree.putAll(hash);
		
		
		for(Map.Entry<String, Integer> entry4 : tree.entrySet()) {
			System.out.print(entry4.getKey() + " ");
		}
		System.out.println();
		System.out.println("Observe that our TreeMap autosorts the hashset in ascending alphabetical order and that the hashmap has it in a random order.");
		
		System.out.println();
		System.out.println();
		System.out.println("Thus, it's apparent that if we want to order our values and keys, we would want to use TreeMap");
		
	}
}
