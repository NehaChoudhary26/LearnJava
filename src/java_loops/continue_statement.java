package java_loops;

public class continue_statement {

	public static void main(String[] args) {
		for(int i = 1;i<=10;i++) {
			if(i==5) {
				continue; // skip execution for particular condition meets and continue from next condition
			}
			System.out.println(i);
		}


	}

}
