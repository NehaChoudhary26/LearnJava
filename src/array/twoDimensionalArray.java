package array;

public class twoDimensionalArray {

	public static void main(String[] args) {
		 int a[][]= new int[3][2];
		a[0][0]=10;
	    a[0][1]=20;
	    a[1][0]=30;
	    a[1][1]=40;
	    a[2][0]=50;
	    a[2][1]=60;
	    /*
	    //read value of array using classic for loop
	    for(int i=0;i<=2;i++) //for rows
	    {       
	    	for(int j=0;j<=1;j++) //for columns
	    	 {
	    		System.out.print(a[i][j]);
	    	}
	    	System.out.println();
	    }*/
	    
	   
	    //read value of array using enhanced for loop
	    for(int i[]:a) {
	    	for(int j:i) {
	    		System.out.print(j+" ");
	    		 
	    	}
	    	System.out.println();
	    }
	   }

}
