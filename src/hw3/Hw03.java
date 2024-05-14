package hw3;

import java.util.Scanner;

public class Hw03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 1, j = 0;
		System.out.println("阿文 請輸入你討厭的數字");
		int a = input.nextInt();
		input.close();

		while (i <= 49) {
			if (i / 10 != a && i % 10 != a) {
				System.out.print(i + "\t");
				j++;
				if (j % 6 == 0)
					System.out.println();
			}
			i++;
		}
		System.out.println("總共有" + j + "個");
		// 進階挑戰
		System.out.println("阿文 你還可以選擇這6個號碼");
		int num6 = 1;
		while (num6 <= 6) {
			int r = (int) (Math.random() * 49) + 1;
			if (r / 10 != a && r % 10 != a) {
				System.out.print(" " + r + " ");
				num6++;
			}
		}
	}
}