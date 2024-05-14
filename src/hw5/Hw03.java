package hw5;

public class Hw03 {

	public static class Work03 {
		public int maxElement(int intArray[][]) {
			int num = 0;
			for (int i = 0; i < intArray.length; i++) {
				num = intArray[i][0];
				for (int j = 0; j < 3; j++) {
					if (num < intArray[i][j])
						num = intArray[i][j];
				}
			}
			return num;
		}

		public double maxElement(double doubleArray[][]) {
			double num = 0;
			for (int i = 0; i < doubleArray.length; i++) {
				num = doubleArray[i][0];
				for (int j = 0; j < 3; j++) {
					if (num < doubleArray[i][j])
						num = doubleArray[i][j];
				}
			}
			return num;
		}
	}

	public static void main(String[] args) {
		int intArray[][] = { { 1, 6, 3 }, { 9, 5, 2 } };
		double doubleArray[][] = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		Work03 w = new Work03();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}
}