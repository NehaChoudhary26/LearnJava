package oops;

public class Employee_usingMethod {
	//declare variable
		int empid;
		String empname;
		int salary;
		int deptno;
		
		// declare method to display values
		void display() {
			System.out.println(empid);
			System.out.println(empname);
			System.out.println(salary);
			System.out.println(deptno);
		}
		
		//declare method to initialize variable values
		// in Method we can pass the parameter or not its optional
		
		void setdata(int id,String name,int sal,int dno) {
			// assign parameter values to local variable
			 empid=id;
			 empname = name;
			 salary =sal;
			 deptno = dno;
			}
		
		public static void main(String[] args) {
			//assign values to class variable using method
			// for this first create object
			Employee_usingMethod emp = new Employee_usingMethod();
			emp.setdata(10,"Raj",2000,7);
			
			// print those values
			emp.display();
			
		}


}
