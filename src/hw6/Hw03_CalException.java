package hw6;

public class Hw03_CalException {
	@SuppressWarnings("serial")
	public class CalException extends Exception{
		public CalException() {}
		public CalException (String msg) {
			super(msg);
		}
	}
}
