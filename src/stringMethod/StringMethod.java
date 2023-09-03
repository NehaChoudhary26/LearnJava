package stringMethod;

public class StringMethod {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "to";
		String s3 = "Java";
		
		//1. length- find the lenght of a string
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
 
		//2. charAt- find the character in a string at given index
		System.out.println(s1.charAt(3));
		
		System.out.println(s2.compareTo(s3));
		
		//3. concat- join two strings
		String s4 = s1.concat(s2).concat(s3).concat(" "+"world");
		System.out.println(s4);
		System.out.println("join".concat(" string"));
		// Alternate of concat is using + operator between two stinngs
		System.out.println(s1+s2+s3);
		
		//4. equals- compare two strings and return boolean values
		
		System.out.println(s1.equals(s4));
		System.out.println("WELCOME".equals("welcome"));
		System.out.println("WELCOME".equals("WELCOME"));
		
		//5.equalsIgnoreCase- ignore the case sensitivity while comparing string and return boolean result
		System.out.println("WELCOME".equalsIgnoreCase("welcome"));
		
		//6. contains- find out particular letters present in the string or not and give result in boolean
		System.out.println(s1.contains("me"));
		System.out.println(s1.contains("t"));
		
		/* 6. substring- substring method extract the part of string from main string.
		  it requires two index parameter to extract value from string. 1. starting index    2. ending index
		  EX:-
		  0 1 2 3 4 5 6 ---------starting index
		  W e l c o m e
		  1 2 3 4 5 6 7 ---------ending index
		  syntax of substring:-
		  substing(starting index,ending index)
		  */
		System.out.println(s1.substring(0, 3));
		
		
		//7. replace- methode is used to replaced a particular character with onthe character
		System.out.println(s1.replace('e','t'));//replace all e
		System.out.println(s1.replaceAll(s1, s4));// replace entire string
		
	}

}
