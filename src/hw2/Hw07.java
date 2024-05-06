package Hw2;

public class Hw07 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				char c = (char) ('A' + i - 1);
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
