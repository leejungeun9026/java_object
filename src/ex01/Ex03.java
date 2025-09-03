package ex01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 문제 3

		Scanner sc = new Scanner(System.in);
		
		System.out.print("x 값을 입력하세요 >> ");
		int x = sc.nextInt();
		int y = (x * x) - (3 * x) + 7;
		System.out.println("x=" + x + ", y=" + y);
		
		sc.close();		
	}
}
