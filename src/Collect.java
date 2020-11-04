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
		hash.put("Deer",3);
		hash.put("Deer",4);
		hash.put("Deer",5);
		
		// Print our hashmap
		for(Map.Entry<String, Integer> entry : hash.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		// Create a Hashset and add all values from hash to it
		HashSet<String> hashUnique = new HashSet<>();
		for(Map.Entry<String, Integer> entry2 : hash.entrySet()) {
			hashUnique.add(entry2.getKey());
		}
		
		// Observe that hashUnique only has 1 deer instead of 3
		for(String entry3 : hashUnique) {
			System.out.println(entry3);
		}
		
		// Create a TreeMap
		TreeMap<String,Integer> tree = new TreeMap<>();
		// Add all values of our HashMap to our TreeMap
		tree.putAll(hash);
		// Observe that our TreeMap autosorts the hash set in ascending order
		// HashMap adds each key and value, but is in a random order, not in the order it's added
		// nor in order
		for(Map.Entry<String, Integer> entry4 : tree.entrySet()) {
			System.out.println(entry4.getKey() + " " + entry4.getValue());
		}
		
		
		// If we wish to order the keys and values, use TreeMap
		
	}
}
