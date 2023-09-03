package Inheritence;
   // inheritence using overriding

      class Bank{                 //super class
    	   int interestRate() {
    		   return 0;
    	   }
    	  }
      class ICICI extends Bank
      {
    	  int interestRate() {          // child class with same parameter & defination but diffrent body
   		   return 10;                   //overriden
   	   }
      }
      class SBI extends Bank
      {
    	  int interestRate() {         // child class with same parameter & defination but diffrent body
   		   return 20;                  //overriden
   	   }
      }
      class Axis extends Bank
      {
    	  int interestRate() {         // child class with same parameter & defination but diffrent body
   		   return 30;                  //overriden
   	   }
      }

public class Overriding_Example1 {

	public static void main(String[] args) {
		
		// object for ICICI bank
		ICICI obj1 = new ICICI();
		System.out.println(obj1.interestRate());
		
		// object for SBI bank
		SBI obj2 = new SBI();
		System.out.println(obj2.interestRate());
				
		// object for Axis bank
		Axis obj3 = new Axis();
		System.out.println();

	}

}
