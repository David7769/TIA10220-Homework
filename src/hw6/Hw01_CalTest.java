package hw6;

import java.util.Scanner;

public class Hw01_CalTest extends Hw02_Calculator{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入x與y值");
		getPowerXY(input.nextInt(), input.nextInt());
		input.close();
		
			try {
				System.out.println();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("0的0次方沒有意義");
			}catch (IndexOutOfBoundsException e) {
					System.out.println("次方為負值，結果回傳不為整數!");
			} catch (Exception e) {
				System.out.println("輸入格式不正確");
			} 
		}
	}
