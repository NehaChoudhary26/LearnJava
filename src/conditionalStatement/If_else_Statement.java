package conditionalStatement;

import java.util.Scanner;

public class If_else_Statement {

	public static void main(String[] args) {
		//Create obect to take input 
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream which take input from console 
		
		System.out.println("enter the age of person");
		int age = sc.nextInt();
		
		if(age>=18){
			System.out.println("Person is eligible for vote");
                   }
		else {
			System.out.println("Not eligible for vote");
			
		    }
		System.out.println("Existed from programme");
	}

	}


