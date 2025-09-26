package guvi1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapobject {

	public static void main(String[] args) {
		Map<Integer, mapclass> hms = new HashMap<Integer, mapclass>();
		mapclass s1 = new mapclass("Sameer",101,26);
		mapclass s2 = new mapclass("Simran",102,16);
		hms.put(s1.id,s1);
		hms.put(s2.id,s2);
		for(Entry<Integer, mapclass> e : hms.entrySet()) {
			mapclass s4=e.getValue();
			System.out.println("ID : "+e.getKey()+" Name : "+s4.name+" Age : "+s4.age);
		}
	}

}
