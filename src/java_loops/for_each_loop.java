package java_loops;

public class for_each_loop {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		//declare array variable and size
		int a[] = new int[5];
		//store element into array
		 a[0] = 5; 
		 a[1] = 4;
		 a[2] = 6;
		 a[3] = 7;
		 a[4] = 15;
		 
		//read element from array
		 for(int i:a) {        //sytax:- for(datatype variable: arrayname)
			 System.out.println(i);
		 }

	}

}
