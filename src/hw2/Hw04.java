package Hw2;

public class Hw04 {
	public static void main(String[] args) {
		int j = 1;
		int i = 1;
		System.out.print(j + " ");
		while (i++ < 19) {
			i += 1;
			j += i;
			System.out.print(" " + j + " ");
		}
	}
}
