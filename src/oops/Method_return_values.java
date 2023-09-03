package oops;

public class Method_return_values {
	// example of calculator
	
	//method returning value & pass the parameter
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int substraction(int a, int b) {
		return a-b;
	}
	
	public int multiplication(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		Method_return_values cal = new Method_return_values();
		
		// assign values to method parameter & initial local variable
		int add = cal.addition(30, 20);
		int sub = cal.substraction(30, 20);
		int mul = cal.multiplication(30, 20);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
	}


}
