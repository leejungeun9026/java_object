package ex01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 문제 9

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99사이 정수를 입력해 주세요 >> ");
		int num = sc.nextInt();
		int first = num/10;
		int second = num%10;
		
		
		if (1 <= num && num <= 99) {			
			if (first == 3 || first == 6 || first == 9) {
				System.out.println("박수 짝");
			} else if ((first == 3 || first == 6 || first == 9) && second == 3 || second == 6 || second == 9) {
				System.out.println("박수 짝");
			} else {
				System.out.println("박수 없음");
			}		
		} else {
			System.out.print("숫자를 잘못 입력했습니다.");
		}
		
		sc.close();		
	}
}
