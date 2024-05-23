package hw7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hw03 {
	public static void copyFile(String inputfile, String outputfile) throws IOException {

		FileReader in = new FileReader(inputfile);
		FileWriter out = new FileWriter(outputfile);
		int c;

		while ((c = in.read()) != -1) {
			out.write(c); // 緩衝區
			System.out.flush(); // 緩衝區寫入目的地
		}
		in.close();
		out.close();
	}
}
