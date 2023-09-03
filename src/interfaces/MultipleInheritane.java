package interfaces;

     // declare first parent as interface 
    interface A{
    	int a=10;
    	void  display();
    }
    
    //declare second parent also as another interface 
 interface B {                // (Note:-can be inherit A by B using extends Keyword(interface to interface))
    	int b=20;
	 void show();
    }
    
  // child class (inherit A & B parents by using implements)
public class MultipleInheritane implements A,B{
	
	public void display() {
		System.out.println(a);
	}
	public void show() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		// create object
		MultipleInheritane MI = new MultipleInheritane();
		
		MI.display();
		MI.show();

	}

}
