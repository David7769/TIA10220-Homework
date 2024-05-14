package hw5;

import java.util.Scanner;

public class Hw01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入寬與高");
		starSquare(input.nextInt(), input.nextInt());
		input.close();
	}

	public static void starSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
