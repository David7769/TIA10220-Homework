package hw4;

public class Hw06 {
	public static void main(String[] args) {
		int array[][] = new int[][] { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int num[] = new int[8];
		for (int i = 0; i < array.length; i++) {
			int save = 0; // 儲存容器
			int count = 0; // 計數容器
			save = array[i][0];
			for (int j = 0; j < 8 ; j++) {
				if (save < array[i][j]) {
					save = array[i][j];
					count = j;
				}
			}
			num[count]++;
		}
		for (int q = 0; q < 8; q++) {
			System.out.println(q +1 + "號同學考最高分的次數有" + num[q]);
		}
	}	
}
