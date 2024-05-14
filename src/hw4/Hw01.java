package hw4;

public class Hw01 {
	public static void main(String[] args) {
		int j = 0;
		int a[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		for (int i = 0; i < a.length; i++) { // 從a[0]比到a[8]，比較a[9]沒有意義
			j += a[i];
		}
		int avg = j / a.length;

		System.out.println("平均值為" + avg);
		System.out.println("================");
		System.out.println("大於平均值的有");
		for (int b = 0; b < a.length; b++)
			if (avg < a[b]) {
				System.out.print(" " + a[b] + " ");
			}
	}
}
