package ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();

		int fivemanwon = money / 50000;
		int manwon = (money % 50000) / 10000;
		int fivechoenwon = ((money % 50000) % 10000) / 5000;
		int choenwon = (((money % 50000) % 10000) % 5000) / 1000;

		System.out.println("50000원권 " + fivemanwon + "개, 10000원권 " + manwon + "개, 5000원권 " + fivechoenwon + "개, 1000원권 "
				+ choenwon + "개");
		
		sc.close();
	}

}
