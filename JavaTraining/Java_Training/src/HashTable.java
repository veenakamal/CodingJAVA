import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		//Collections
		//Dynamic Array
		Hashtable h = new Hashtable();
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		System.out.println(h.size());
		h.put(1, 100);
		h.put(2, 200);
		h.put(3, 300);
		System.out.println(h.size());
		System.out.println(h.get(2));
		System.out.println(h.get("C"));





		
	}

}
