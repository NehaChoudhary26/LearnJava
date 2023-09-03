package hashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		
		// add entry set using put method
		hm.put(100, "AAdi");
		hm.put(200, "Raj");
		hm.put(300, "Priya");
		
		System.out.println(hm);         // print entry set values
		System.out.println(hm.size());
		
		for(Map.Entry m:hm.entrySet()) {
			
		//m.getKey()       to get key 
		//	m.getValue()     to get values
		
			System.out.println(m.getKey()+" "+m.getValue());

	}
	}
}
