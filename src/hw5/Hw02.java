package hw5;

public class Hw02 {
	public static void main(String[] args) {
		randAvg(0);
	}

	public static void randAvg(double randAvg) {
		double num = 0;
		double i = 0;
		while (num < 10) {
			int r = (int) (Math.random() * 101);
			i += r;
			System.out.print(" " + r + " ");
			num++;
		}
		randAvg = i / num;
		System.out.println();
		System.out.println("平均值為");
		System.out.println(randAvg);
	}
}
