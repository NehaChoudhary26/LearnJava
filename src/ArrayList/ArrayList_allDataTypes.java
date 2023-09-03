package ArrayList;

import java.util.ArrayList;

public class ArrayList_allDataTypes {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		System.out.println("Size of array before adding values: "+list.size()); 
		
		list.add("String");
		list.add(10);
		list.add(20.243);
		list.add('c');
		
		System.out.println("Size of array after adding values: "+list.size());
		System.out.println("print array after adding values: "+list);
		
		//insert value at index 2
		list.add(2, "Add_value");
		System.out.println("print array after adding values: "+list);
		
		//insert value at index 4
		list.add(4, 30);
		System.out.println("print array after adding values: "+list);
		
		// removing value 1. by value   2. by Index
		
		list.remove("String");
		System.out.println("print array after remove value: "+list);
		
		list.remove(3);
		System.out.println("print array after remove value: "+list);

	}

}
