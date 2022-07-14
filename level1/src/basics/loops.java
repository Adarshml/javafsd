package helloworld;

public class loops {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i += 2)
			System.out.println("Value of i : " + i);

		for (int x = 1; x < 6; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int k = 22; k <= 98; k += 2)
			System.out.println(k);

		int sum = 0, z = 0;

		for (int j = 1; j <= 100; j++) {
			if ((j % 3 == 0) && (j % 5 == 0)) {
				z++;
				sum = sum + j;
				if (z == 5) {
					break;
				}
			}

		}
		System.out.println("sum " + sum);
		System.out.println("Check");
	}
}