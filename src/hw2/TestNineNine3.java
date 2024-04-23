package hw2;

public class TestNineNine3 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 9) {
			i++;
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
	}

}
