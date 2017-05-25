package src.main.java;

public class Flowchar1 {

	public static void main(String[] args) {
		String B = "Bazz";
		String F = "Fizz";

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println(F + B);
				} else {
					System.out.println(F);
				}
			} else if (i % 5 == 0) {
				System.out.println(B);
			} else {
				System.out.println(i);
			}
		}
	}

}