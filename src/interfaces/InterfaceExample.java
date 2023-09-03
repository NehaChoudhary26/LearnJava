package interfaces;

   // declare interface
  interface TestInter{
	  
	  int a=10;        // a is by default static & final
	  // declare abstract method
	  void display();
  } 
  
  // declare immedidiate subclass to inherit or declare method

public class InterfaceExample implements TestInter{
	public void display()         // use public in front of method bcoz interface contain only public method
	{
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// instatiation
		InterfaceExample testobj = new InterfaceExample();
		testobj.display();

	}

}
