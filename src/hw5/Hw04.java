package hw5;

public class Hw04 {
	public static class MyRectangle {

		private double width;
		private double depth;

		public double getwidth() {
			return width;
		}

		public void setwidth(double widthx) {
			width = widthx;
		}

		public double getdepth() {
			return depth;
		}

		public void setdepth(double depthx) {
			depth = depthx;
		}

		public double getArea() {
			double Area = width * depth;
			System.out.println("該長方形的面積為" + Area);
			return Area;
		}

		public MyRectangle() {
		}

		public MyRectangle(double width, double depth) {
			this.width = width;
			this.depth = depth;
		}
	}
}
