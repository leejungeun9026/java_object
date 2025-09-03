package ex01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 문제 7

		Scanner sc = new Scanner(System.in);
		
		System.out.print("학점을 입력하세요 >> ");
		String grade = sc.next();
		
		switch(grade) {
		case "A" :
		case "B" : System.out.println("Excellent");
			break;
		case "C" :
		case "D" : System.out.println("Good");
			break;
		case "F" : System.out.println("Bye");
			break;
		default : System.out.println("학점을 잘못입력했습니다.");
		}
		
				sc.close();		
	}
}
