package hw3;

import java.util.Scanner;

public class Hw02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = (int) (Math.random() * 101);
		while (true) {
			System.out.println("請輸入數字");
			int i = input.nextInt();
			input.close();

			if (i == r) {
				System.out.println("猜對了！答案就是" + i);
				break;
			}
			// 進階功能
			else if (i < r) {
				System.out.println("猜錯囉！再大一點");
			} else {
				System.out.println("猜錯囉！在小一點");
			}
		}
	}
}