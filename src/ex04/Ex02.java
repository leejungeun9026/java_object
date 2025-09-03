package ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력 : ");
		
		int num = sc.nextInt();
		
		String numToString = Integer.toString(num);
		int count = numToString.length();
		System.out.println(count + "자 입니다.");
		
		sc.close();
	}
}
