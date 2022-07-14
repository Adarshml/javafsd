package helloworld;

public class variable {
	public static void main(String[] args) {
		//variables
		int a,b,c,result;
		a=10;
		b=20;
		c=44;
		result= a+b*c;
		System.out.println(result);
		
		//primitive types
		System.out.println( "min byte : " + Byte.MIN_VALUE );
		System.out.println( "max short : " + Short.MAX_VALUE );
		System.out.println( "min integer : " + Integer.MIN_VALUE );
		System.out.println( "max long : " + Long.MAX_VALUE );
		System.out.println( "min float : " + Float.MIN_VALUE );
		System.out.println( "max double : " + Double.MAX_VALUE );
		float val1 = 5.23f; //default  is double so add f in end of the value
		float val2 = (float) 5.23; //type casting - converting from one type to another
		double val3 = 5.67;
		double val4 = 5.67d;
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		 
		int d=7/2;
		float e=7/2;
		System.out.println("int : " + d + ",float :" +e);
		System.out.println(d + " " +e);
		
		//casting
		int i1 = 10;
		byte b1 = 12;
		i1 = b1;
		System.out.println(i1);
		i1=140;
		b1 = (byte)i1;
		System.out.println(b1);
		
		//character and boolean
		char c1 = 'a';
		int i2 = c1;
		System.out.println(i2);
		
		char x = 69;
		System.out.println( " Char x = "+ x);
		
		char uc = '\u0044';//unicode
		System.out.println(uc);
		
		boolean t = true;
		System.out.println(t);
		
	}

}
