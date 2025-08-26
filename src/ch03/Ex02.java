package ch03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 문제 2

		Scanner sc = new Scanner(System.in);
				
		System.out.print("몇 층인지 입력하세요 >> ");
		int height = sc.nextInt();
		System.out.println(height * 5 + "m 입니다.");
		
		sc.close();		
	}
}
