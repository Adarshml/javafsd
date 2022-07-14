package helloworld;

public class conditions {
	public static void main(String[] args) {
		boolean isAlien = false;
		if (isAlien) {
			System.out.println("Alien");
		}
		if (!isAlien) {
			System.out.println("not an Alien");
		}

		int a = 5,b=10,c=8;
		if (a > 0) {
			System.out.println("Positive");
		} else if (a < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
		
		//ternary operator
		int big = (a>b)? a:b;
		System.out.println("Greater value : " + big);
		
		System.out.println();
		boolean houseAvailable = false;
		boolean loanApproved = houseAvailable ? true : false;
		String result = (loanApproved)? "Loan Approved" : "Not Approved";
		System.out.println(result);
		
		
		System.out.println("a < b = " + (a<b));
//		System.out.println("a < b and a < c = " + (a<b && a<c));  // logical AND
//		System.out.println("a < b and a < c = " + (a<b & a<c));   // bitwise AND
	
		System.out.println("a < b and a < c = " + (a<b && ++a<c));  // logical AND
		System.out.println("A after logical and = " + a);
		System.out.println("a < b and a < c = " + (a<b & ++a<c));  // bitwise AND
		System.out.println("A after bitwise and = " + a);
		
		System.out.println("");
		
		// == comparison
		// = assignment
		
		boolean mybool = false;
		if (mybool=true) {
			System.out.println("X");
		} else {
			System.out.println("Y");
		}
		
		System.out.println("what will be the value ? " + (mybool=false));
	}
}
