package exceptionHandling;

public class TryCatchFinally_Unchecked_case2 {

	public static void main(String[] args) {
int arr[]= new int [5];
		
		try {
			arr[10]= 100;
		}
		catch(ArithmeticException e){              // wrong Exception name so that catch block not handle
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("This is final statement");

	}
	}
}
