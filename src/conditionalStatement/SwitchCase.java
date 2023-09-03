package conditionalStatement;

public class SwitchCase {
	/*
	 Syntex for Switch case condition:-
	 switch(variable)
	 {
	 case condition1: //code; break;
	 case condition2: //code; break; // break - as soon as condition will meet, execution came out from switch condition mean further cases will not be execute due to break
	 .......
	 .......
	 default //code; break;
	 }
	 */

	public static void main(String[] args) {
		int day=5;
		
		switch(day) {
		case 1:
			System.out.println("Day is Monday");
			break;
		case 2:
			System.out.println("Day is tuesday");
			break;
		case 3: System.out.println("Day is wednesday ");break;
		case 4: System.out.println("Day is Thursday");break;
		case 5: System.out.println("Day is Friday");break;
		case 6: System.out.println("Day is Saturdday");break;
		default:System.out.println("Day is Sunday")	;
		}

	}

}
