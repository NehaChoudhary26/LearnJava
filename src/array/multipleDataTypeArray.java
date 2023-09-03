package array;

public class multipleDataTypeArray {

	public static void main(String[] args) {
	/*Object a[]= new Object[5]; // using object keyword we can store diffrent data type values in array
	a[0]=10;
	a[1]="String";
	a[2]='c';
	a[3]=10.5;
	a[4]=true;*/
		
		Object a[]= {10,"String",'c',10.5,true};
	
	for(Object i:a) {
		System.out.println(i);
	}

	}

}
