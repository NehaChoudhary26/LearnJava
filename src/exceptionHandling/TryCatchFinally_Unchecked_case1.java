package exceptionHandling;

public class TryCatchFinally_Unchecked_case1 {

	public static void main(String[] args) {
		
		int arr[]= new int [5];
		
		try {
			arr[10]= 100;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("This is final statement");
		}

	}

}
