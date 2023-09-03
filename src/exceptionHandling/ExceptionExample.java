package exceptionHandling;

public class ExceptionExample {

	public static void main(String[] args) {
		
		System.out.println("started");
		
		//Thread.sleep(3000);    // Interupted exception(checked exception)
		
		int i=10;
		System.out.println(i/0);       // arithmaticException (unchecked exception)
		
		System.out.println("done");
		
		

	}

}
