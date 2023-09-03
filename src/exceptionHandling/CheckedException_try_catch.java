package exceptionHandling;

public class CheckedException_try_catch {

	public static void main(String[] args) {
		
		System.out.println("programme is started");
		System.out.println("programme is in progress");
		try {
		Thread.sleep(4000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("programme is completed");
		System.out.println("programme is exited");

	}

}
