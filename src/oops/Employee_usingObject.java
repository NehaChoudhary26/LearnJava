package oops;

public class Employee_usingObject {
	
	//declare variable
	int empid;
	String empname;
	int salary;
	int deptno;
	
	// declare method
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
    // declare main method 
	public static void main(String[] args) {
	// declare object- to initialize variable using object and call methed
	 Employee_usingObject emp1 = new Employee_usingObject();{
	 // initialize variable
     emp1.empid = 101;
	 emp1.empname = "Raj";
	 emp1.salary = 2000;
	 emp1.deptno = 7;
	 
	 //call methed usin object
	 emp1.display();
	 }
	 }
}
