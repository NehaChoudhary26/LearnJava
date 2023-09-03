package array;

public class multidimentionalarray {

	public static void main(String[] args) {
		int a[][]= {{10,20,15},{30,40,59},{50,60,65},{23,43,56},{56,74,19}};
		/*for(int i=0;i<=4;i++) //for rows
	    {       
	    	for(int j=0;j<=2;j++) //for columns
	    	 {
	    		System.out.print(a[i][j]+" ");
	    	}
	    	System.out.println();
	    }*/
		
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
