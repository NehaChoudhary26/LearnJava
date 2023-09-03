package exceptionHandling;

public class UncheckedException {

	public static void main(String[] args) {
		
		System.out.println("started");
		int i =10;
		System.out.println(i/0);                 //ArithmatocException
		
		String st = null;
		System.out.println(st.length());         // NullpointerException
		
		System.out.println("in progress");
		System.out.println("completed");

	}

}
