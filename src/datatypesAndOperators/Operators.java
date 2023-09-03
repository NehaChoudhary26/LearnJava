package datatypesAndOperators;

public class Operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Result of aithmatic operators");
		//airthmatic operators are +, -, *, /(division), %(Quotient)
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);
		
		System.out.println("Result of Relational operators");
		//Relational operator are <, >, <=, >=, ==, != (Relational operators return boolean values)
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println("Result of Logical operators");
		//logical operators are &&(AND), ||(OR), !(NOT) (logical operators return boolean values)
		boolean x = true;
		boolean y = false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		System.out.println("Result of Assignment operators");
		//assignment operators are =, +=, /=, *=
		int c;
		c =a; // c = 10
		/*
		 * c+=5; // means c = c+5
		c-=2; //  means c= c-2
		c*=2; // means c= c*2
		c++; // c = c+1 (increment operator)
		c--; // c = c-1 (decrement operator)
		*/
		System.out.println(c);

	}

}
