package array;

public class DynamicArray {

	public static void main(String[] args) {
		
		int a[]= {100,200,300,400,500};// we can store any no.of elements, no need to define size of array
		int sum=0;
		for(int i:a) {
			System.out.println(i);
			sum=sum+i;
			}
		
		System.out.println("sum of element of array is =" +sum);

	}

}
