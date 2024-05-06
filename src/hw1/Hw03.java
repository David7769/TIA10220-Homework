package Hw1;

public class Hw03 {
	public static void main(String[] args) {
		int num1 = 256559;
		double day = 24 * 60 * 60;
		double hour = 60 * 60;
		double min = 60;
		System.out.printf(" 天 = %.2f ", num1 / day);
		System.out.printf("小時 =  %.2f ", num1 / hour);
		System.out.printf("分鐘 =  %.2f ", num1 / min);
		System.out.printf("秒" + num1);
	}
}
