package array;

public class stringarray {

	public static void main(String[] args) {
		 String s[] = new String[5];
		 s[0]= "Welcome";
		 s[1]= "to";
		 s[2]= "java";
		 s[3]= "World";
		 
		 System.out.println("length of array is= "+s.length);// s.length return the size of array
		 
		 for(String i : s) {
			 System.out.println(i);
		 }

	}

}
