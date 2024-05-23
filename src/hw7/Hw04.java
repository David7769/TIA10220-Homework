package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Hw04 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\data");
		file.mkdir();

		FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		Animal c1 = new Cat(null);
		Animal c2 = new Cat(null);
		Animal d1 = new Dog(null);
		Animal d2 = new Dog(null);

		oos.writeObject(c1);
		oos.writeObject(c2);
		oos.writeObject(d1);
		oos.writeObject(d2);

		oos.close();
		bos.close();
		fos.close();
	}
}
