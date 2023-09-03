package interfaces;

public class Final_Example {
	
	class Test{
		final int a=10;
		 final void m1() {
			 // a=20;     not possible because a is a final variable
			 System.out.println(a);
		 }
		   void m1(int x, int y) {      
			   System.out.println("m1 is overloaded");
		   }
	  }
		final class Test2 extends Test{
			  /*void m1() {             //m1 can not be overridden
				  System.out.println("m1 is overridden");
			  }*/
		 }
		
		/*class Test3 extends Test2{      // can not extends Test2
			
		}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
