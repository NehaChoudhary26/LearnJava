package interfaces;

public class Defination {
	/*
	  -------------------------------------------------------------------------------------------
	  final keyword:- final keyword can be used in front of variable, method & class.
	    final Variable:- then varirble value can not be changed.
	    final method:- then menthod can not be overridden.(bot it can be overloaded)
	    final class:- then class can not be extends(means can not ne inheriet)
	  --------------------------------------------------------------------------------------------
	  
	  Interface:- 1. it is basically a blue print of a class bcoz it seems very similar to a class.
	              2. interface contains only static & final variables (by default)
	              3. interface contains abstract method by defaut.
	              4. In interface methods are public by default.
	              5. we can not instatiate interface
	                  means for below example-
	                  Test_interface obj_name= new Test_interface();     //not valid
	                  Test_interface obj_name = new Testclass();         //valid (for instatiation we must use class name)
	              .
	     Declaration:-
	     interface_keyword interface_name{
	     define variable
	     define method
	     }
	    -----------------------------------------------------------------------------------------------
	    abstract method:- a method that have only defination (means parameter), not implementation(mean no body)
	    Declaration:- 
	     interface Test_interface{                   // declare interface
	                void m1();                       // declare abstract method(without body)
	     }
	    
	    ------------------------------------------------------------------------------------------------      
	     Note:-   * for class to class inheritence, use extends keywords
	              * for interface to class, use implements keyword
	              * 
	    
	         e.g.:-
	         interface Test_interface{
	                void m1(); 
	     }
	     
	     class Testclass implements Test_interface{
	              body
	     }
	   
	 */

}
