package ch03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 문제 10

		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피 주문하세요 >> ");
		String coffee = sc.next();
		
		int cup = sc.nextInt();
		int price = 0;
		double total;		
		
		if (cup < 10) {			
			if(coffee.equals("에스프레소")) {
				price = 2000;
			} else if (coffee.equals("아메리카노")) {
				price = 2500;
			} else if (coffee.equals("카푸치노")) {
				price = 3000;
			} else if (coffee.equals("카페라떼")) {
				price = 3500;
			}
			total = price * cup;
		} else {
			if(coffee.equals("에스프레소")) {
				price = 2000;
			} else if (coffee.equals("아메리카노")) {
				price = 2500;
			} else if (coffee.equals("카푸치노")) {
				price = 3000;
			} else if (coffee.equals("카페라떼")) {
				price = 3500;
			}
			total = (price * cup) * 0.95;
		}
		
		System.out.println((int)total);		
		
		sc.close();		
	}
}
