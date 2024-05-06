package Hw1;

public class Hw04 {
	public static void main(String[] args) {
		final double num1 = 3.1415;
		double radius = 5;
		double diameter = 10;
		System.out.printf(" 圓面積 = %.4f ", Math.pow(radius, 2) * num1);
		System.out.printf(" 圓周長 = %.3f ", num1 * diameter);
	}
}
