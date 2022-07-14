package helloworld;

public class strings {

	public static void main(String[] args) {
		
		var s5 = new String("Adarsh");
		char[] c = {'h','a','i'};//Character array
		//string literal ,string is an object of class string
		String name = "MAX";
		System.out.println("Name : " + name);
		System.out.println("Length : " + name.length());
		System.out.println(c);
		System.out.println(s5);
		//string methods
		String s ="Hello world";
		System.out.println("Length : " + s.length());
		System.out.println("Index of w : " + s.indexOf('w'));
		System.out.println("Char at pos 3 : " + s.charAt(3));
		System.out.println("Index of w : " + s.indexOf('l',4));//index of a char starting from a particular position
		System.out.println("Substring : " + s.substring(3));
		System.out.println("Substring : " + s.substring(3,8));
		String[] s2 = s.split(" ");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println("Replace hello by hai : " + s.replace("Hello","Hai"));
		System.out.println("To upper case : " + s.toUpperCase());
		System.out.println("To lower case : " + s.toLowerCase());
		
		
		
	}

}
