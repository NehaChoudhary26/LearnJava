package exceptionHandling;

public class TryCatchFinally_Unchecked_case3 {

	public static void main(String[] args) {
		int arr[]= new int [5];
		
		try {
			arr[4]= 100;             // change array index
		}
		catch(ArrayIndexOutOfBoundsException e){              // catch will ignore by default
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("This is final statement");

	}
	}

	}


