package oops;

public class Employee_constructor {
	
	int empid;
	String empname;
	int salary;
	int deptno;

		// declare method (with same name as class) & pass the parameters
	 Employee_constructor(int id,String name,int sal,int dno) {
		//Assign parameter values to class variable
		 empid=id;
		 empname = name;
		 salary =sal;
		 deptno = dno;
		}
	 
	 // declare main method
	 public static void main(String[] args) {
		 // call the constructor by passing variable values while creating object
		 Employee_constructor emp = new Employee_constructor(10,"Raj",2000,7);
		 
		 // Display these values 
		System.out.println(emp.empid);
		System.out.println(emp.empname);
		System.out.println(emp.salary);
		System.out.println(emp.deptno);
	 }
		
		

}
