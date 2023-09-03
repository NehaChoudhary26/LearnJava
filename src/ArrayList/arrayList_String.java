package ArrayList;

import java.util.ArrayList;

public class arrayList_String {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList();
		list.add("Raj");
		list.add("priya");
		list.add("jai");
		list.add("Kiran");
		list.add("Atharv");
		
		System.out.println("size of Array is= "+list.size());
		
		// to print array list data
		
		for(String s:list) {                   //for array use for-each loop
			System.out.println(s);
		}

	}

}
