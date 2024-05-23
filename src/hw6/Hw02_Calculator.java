package hw6;

public class Hw02_Calculator {
	public static void getPowerXY(int x, int y) {
		int Power = (int) Math.pow(x, y);
		while (true) {
			if (x > 0 && y > 0) {
				System.out.println(x + "的" + y + "次方等於" + Power);
			} else if (x == 0 && y == 0) {
				System.out.println(x + "的" + y + "次方沒有意義");
			} else if (y < 0) {
				System.out.println("次方為負值，結果回傳不為整數!");
			} else {
				System.out.println("輸入格式不正確");
			}
			return;
		}
	}
}
