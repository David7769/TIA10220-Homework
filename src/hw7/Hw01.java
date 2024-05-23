package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hw01 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\TIA102_workspace\\TIA10220-Homework\\src\\hw7\\Sample.txt");

		FileReader fr = new FileReader(file);
		BufferedReader bfr = new BufferedReader(fr);
		System.out.println("Sample.txt檔案共有");
		System.out.println(file.length() + "個位元組");

		int character = 0; // 儲存字元
		int Rows = 0; // 儲存行數
		String i;
		while ((i = bfr.readLine()) != null) { //讀取到空值會繼續讀取下一行
			Rows++;
			character += i.length();
		}
		System.out.println(character + "個字元");
		System.out.println(Rows + "列資料");
		bfr.close();
		fr.close();
	}
}
