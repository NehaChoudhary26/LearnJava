package Inheritence;

 class A{                           //parent class(also called Base class or Super class)
		int a,b;
		public void display() {
			System.out.println(a+b);
		}
  }
      //child1 Class B 
   class B extends A {                         // Class B aquiring property of Class A
	int x;
	int y;
		public void show() {
					System.out.println(x+y);
				}
		 }
   
   
   //child2 Class C
   
   class C extends B                    // aquire property of both class A & class B
   {
	   int p,q;
	   public void run() {
		   System.out.println(p+q);
	   }
   }
	
   
   
	public class Extends_Class {

	public static void main(String[] args) {
		// creste object for class A
		A obj_a= new A();
		obj_a.a=100;
		obj_a.b=200;
		obj_a.display();
		
		// creste object for class B
		B obj_b= new B();
		obj_b.x=300;
		obj_b.y=400;
		obj_b.a=500;
		obj_b.b=600;
		
		obj_b.display();
		obj_b.show();

	}

}
