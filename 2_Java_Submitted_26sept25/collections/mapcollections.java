package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapcollections {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(101,"Jeeva");
		m.put(102,"Ashok");
		m.put(103,"Mohan");
		m.put(1001, "Sriram");
		System.out.println(m);
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m.get(101));
		m.remove(1001);
		System.out.println("Contains Key 1001 : "+m.containsKey(1001));
		System.out.println("Contains Value Ashok : "+m.containsValue("Ashok"));
		for (Entry<Integer, String> entry : m.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

	}

}
