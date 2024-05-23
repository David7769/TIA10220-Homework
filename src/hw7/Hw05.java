package hw7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Hw05 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f1 = new File("C:\\data\\Object.ser");

		FileInputStream fis = new FileInputStream(f1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);

		try {
			while (true) { // 讀取物件
				Animal animal = (Animal) ois.readObject();
				animal.speak();
			}
		} catch (IOException e) {
		}
		ois.close();
		bis.close();
		fis.close();
	}
}
