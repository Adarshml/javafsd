package SL;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		//scanner
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter first number" );
		n1 = sc.nextInt();
		System.out.println("Enter second number" );
		n2 = sc.nextInt();
		System.out.println("Sum = "+ (n1+n2) );
	}

}