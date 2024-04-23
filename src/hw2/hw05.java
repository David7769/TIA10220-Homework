package hw2;

public class hw05 {
	public static void main (String [] args) {
		int i = 1 , j = 0 ;
		while (i <= 49) {
			if (i / 10 != 4 && i % 10 != 4) {
				System.out.print( i + "\t");
				j ++;
				if (j % 5 == 0)
					System.out.println();
			}
			i ++;
		}
		System.out.println("總共有" + j + "個");
		}
}
