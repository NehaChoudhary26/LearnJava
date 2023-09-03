package overloading_concepts;

public class Method_overloading {
	
	int a;
	int b;
	double c;
	int d;
	
	// Method1
	void sum() {                              //method not taking any parameter
		a = 10;
		b= 20;
		System.out.println(a+b);
	}
	
	// Method2
	void sum(int x, int y) {                   //method passing 2 parameter
		a=x;
		b=y;
		System.out.println(a+b);
	}
	
	// Method3
	void sum(int x, double y) {              // method again passing two parameter but with diff datatype
		a=x;
		c=y;
		System.out.println(a+c);
	}
	
	// Method4
	void sum(double y, int x) {              //same as method3 but with different order
		a=x;
		c=y;
		System.out.println(a+c);
		}
		
	// Method5
	void sum(int x, int y, int z) {              //method passing diff no.(3) of parameter
		 // without assigning class veriable directly use extertal variable
		System.out.println(a+b+d);
		}
	
	public static void main(String[] args) {
		Method_overloading mo = new Method_overloading();
		
		mo.sum();                       //  call method1
		mo.sum(10,20);                  // call method2
		mo.sum(10,10.5);                // call method3
		mo.sum(20.5, 30);               // call method4
		mo.sum(20,10,40);              // call method5
		
	}

}
