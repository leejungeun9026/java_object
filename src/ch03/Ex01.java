package ch03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 문제 1

		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "+" + num2 + "은 " + (num1 + num2));
		
		sc.close();		
	}
}