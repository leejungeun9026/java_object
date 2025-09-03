package ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 입력 : ");
		
		String word = sc.next();
		char chr = word.charAt(0);
		
		for (int i = chr; i >= 'a'; i--) {
			for (int j = 'a'; j <= i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}
