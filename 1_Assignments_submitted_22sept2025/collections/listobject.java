package collections;

import java.util.ArrayList;
import java.util.List;

public class listobject {

	public static void main(String[] args) {
		List<listclass> a1 = new ArrayList<listclass>();
		listclass s1 = new listclass("Jeeva",101);
		listclass s2 = new listclass("Mani",102);
		listclass s3 = new listclass("Akila",103);
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		listclass s4 = a1.get(0);
		s4.display();
		for(listclass s5:a1) {
			s5.display();
		}
	}

}
