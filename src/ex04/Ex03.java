package ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력 : ");
		
		int[] num = new int[3];
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
						
		int minNum = Math.min(num[0], Math.min(num[1], num[2]));
		System.out.println(minNum);
	}
}
