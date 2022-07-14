package helloworld;

public class typeCastingChallenge {
	public static void main(String[] args) {
		String input = "12";
		
		byte mybyte = Byte.parseByte(input);
		System.out.println("Byte value = "+mybyte);
		//these method used to parse the string values into the desired data type
		int myint = Integer.parseInt(input);
		System.out.println("Int value = "+myint);
	}

}
