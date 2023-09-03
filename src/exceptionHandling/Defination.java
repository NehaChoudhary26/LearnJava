package exceptionHandling;

public class Defination {
	/*
	
	Exception:- Exception is an event which will terminate programme unexpectedly.
	
	Exception Handling:- Exception Handling is a mechanism to handle runtime errors to maintain the normal 
	                     flow of the application.
	   e.g:-
	    if there are 10 statements in a Java program and an exception occurs at statement 5; the rest of the 
	    code will not be executed. when we perform exception handling, the rest of the statements will be
	    executed. 
	    
	   Types of Java Exceptions:-
	            1. Checked Exception:- exceptions which are identified by the java compiler
	            ex:- IOException, FileNotFoundException etc
                2. Unchecked Exception:- exceptions which are not identified by the java compiler
                ex:- arithmeticException, NullpointerException, NumberFormatException, ArrayIndexOutofBound etc
       
               An error is also considered as the unchecked exception. 
     --------------------------------------------------------------------------------------------------------------
     Unchecked Exception:- arithmeticException,
                           NullpointerException, 
                           NumberFormatException,
                           ArrayIndexOutofBound
     ------------------------------------------------------------------------------------------------------------
     How to handle :- 
                 1. try....catch (both checked & unchecked Exception can be handle using this method) 
                 2. throws keyword (can handle onle checked Exception)
     ------------------------------------------------------------------------------------------------------------
     Syntex 1: try...catch     
               
               try{
               specify the statement which cause exception
               }
               catch(Excepyion tpye name) 
               {
                 write statement(optional)
               }
     
     Syntex 2: try...catch.....finally   
     
                           try{
               specify the statement which cause exception
               }
               catch(Excepyion tpye name) 
               {
                 write code (optional)
               }
               finally
               {
               // code
               }
       There can be 3 case:-
              1. Exception occurs, cattch block handles,finally block also execute
              2. Exception occurs, cattch block not handles,finally block execute
              3. Exception not occurs, cattch block not handles,finally block execute
     ----------------------------------------------------------------------------------------------------------
            Note:- 1.Exception--------> is basically a superclass
                   2. throws keyword applied at method level while try-catch method appliied at statement level
      ---------------------------------------------------------------------------------------------------------
	*/

}
