package ex01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 문제 5

		Scanner sc = new Scanner(System.in);
		
		System.out.print("논리 연산을 입력하세요 >> ");
		boolean first = sc.nextBoolean();
		String op = sc.next();
		boolean second = sc.nextBoolean();
		
		
		switch (op) {
		case "OR" : 
			System.out.println(first || second);
			break;
		case "AND" : 
			System.out.println(first && second);
			break;
		default : 
			System.out.println("잘못입력했습니다.");
		}
		
		sc.close();		
	}
}
