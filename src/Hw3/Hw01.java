package Hw3;

import java.util.Scanner;

public class Hw01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入三角形的第一個邊長");
		double a = input.nextDouble();
		System.out.println("請輸入三角形的第二個邊長");
		double b = input.nextDouble();
		System.out.println("請輸入三角形的第三個邊長");
		double c = input.nextDouble();
		
		if (a == b && b == c && c == a) {
			System.out.println("正三角形");
		    } 
		else if (a == b || b == c || c == a) {
			System.out.println("等腰三角形");
			}
		//進階功能:加入直角三角形
		else if (Math.pow(a, 2) +Math.pow(b, 2) == Math.pow(c, 2)
					|| Math.pow(b, 2) +Math.pow(c, 2) == Math.pow(a, 2)
					|| Math.pow(a, 2) +Math.pow(c, 2) == Math.pow(b, 2)) {
			System.out.println("直角三角形");
			}
		else if (a + b <= c || a + c <= b || c + b <= a) {
			System.out.println("不是三角形");
		    }
		else  {
			System.out.println("其他三角形");
		    }
	}
}		