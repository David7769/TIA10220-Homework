package hw4;

import java.util.Scanner;

public class Hw04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("小華你想借多少?");
		int a = input.nextInt();
		input.close();

		int count = 0; //計算容器
		int[][] array = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		System.out.println("能借的同事員編");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] >= a) {
					System.out.print(array[i][0] + " ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("共" + count + "人");
	}
}
