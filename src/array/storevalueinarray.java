package array;

import java.util.Scanner;

public class storevalueinarray {

	public static void main(String[] args) {
		
		System.out.println("Enter the value");
		//declare array variable and size
		int a[] = new int[10];
		//store element into array
		 a[0] = 5; 
		 a[1] = 4;
		 a[2] = 6;
		 a[3] = 7;
		 a[4] = 15;
		 
		 //read element from array
		 for(int i=0;i<=4;i++) {
		 System.out.println(a[i]);
		 }

		 
		 /*//for....each loop or enhanced loop
		 for(int i:a) {
			 System.out.println(i);
		 }*/
	}

}
