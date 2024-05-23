package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Hw02 {
	public static void main(String args[]) {
		Set<Integer> set = new HashSet<Integer>();
		try {
			FileWriter fw = new FileWriter("C:\\TIA102_workspace\\TIA10220-Homework\\src\\hw7\\Data.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			int i = 0;
			while (i != 10) {
				int r = (int) (Math.random() * 1000) + 1;
				set.add(r); // 避免重複
				i++;
				System.out.print(r + " ");
				pw.println(r);
			}
			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
