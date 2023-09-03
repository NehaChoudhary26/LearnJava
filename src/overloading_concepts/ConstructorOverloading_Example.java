package overloading_concepts;

public class ConstructorOverloading_Example {
	// this example we will use without assigning class variable
	
	//constructor Method1
	ConstructorOverloading_Example(){
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	// constructor Method2
	ConstructorOverloading_Example(int a,int b){
		System.out.println(a+b);
	}
	
	// constructor Method3
		ConstructorOverloading_Example(int a,int b, int c){
			System.out.println(a+b+c);
		}
		
	// constructor Method4
		ConstructorOverloading_Example(int a,double b){
			System.out.println(a+b);
		}
		
	// constructor Method5
		ConstructorOverloading_Example(double b ,int a){
			System.out.println(a+b);
		}
	

	public static void main(String[] args) {
		// create object
		ConstructorOverloading_Example co1 = new ConstructorOverloading_Example();  //call first		
		ConstructorOverloading_Example co2 = new ConstructorOverloading_Example(10,20); // call 2nd
		ConstructorOverloading_Example co3 = new ConstructorOverloading_Example(20,10,30); // call 3rd
		ConstructorOverloading_Example co4 = new ConstructorOverloading_Example(10,30.2); // call 4rt
		ConstructorOverloading_Example co5 = new ConstructorOverloading_Example(30.5,10); //call 5th

	}

}
