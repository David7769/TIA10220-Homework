package hw2;

public class TestNineNine2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int j = 0;
			int q = 1;
			do { j += q;
				q++;
			} while (q < 9) ;
			{
				System.out.print(i + "*" + q + "=" + i * q + "\t");
				q++;
			}
		}
		System.out.println();
	}
}