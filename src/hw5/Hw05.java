package hw5;

import java.util.HashSet;
import java.util.Set;

public class Hw05 {
	public static String genAuthCode() {
		Set<Integer> set = new HashSet<Integer>();
		char c[] = new char[8];
		int i = 0;
		while (i != 8) {
			int r = (int) (Math.random() * 75) + 48;
			if ((r >= 48 & r <= 57) || (r >= 65 && r <= 90) || (r >= 97 && r <= 122)) {
				set.add(r); // 避免重複
				c[i] = (char) r;
				i++;
			}
		}
		return String.valueOf(c);
	}

	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為:");
		System.out.println(genAuthCode());
	}
}
