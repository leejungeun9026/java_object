package ch03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 문제 6
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("돈의 액수를 입력하세요 >> ");
		int money = sc.nextInt();
		int fivemanwon = money/50000;
		int manwon = (money%50000)/10000;
		int chunwon = ((money%50000)%10000)/1000;
		int fivebeakwon = (((money%50000)%10000)%1000)/500;
		int beakwon = ((((money%50000)%10000)%1000)%500)/100;
		int tenwon = (((((money%50000)%10000)%1000)%500)%100)/10;
		int ilwon = (((((money%50000)%10000)%1000)%500)%100)%10;
		
		System.out.println("오만원 " + fivemanwon + "개, 만원 " + manwon + "개, 천원 " + chunwon + "개, 500원 " + fivebeakwon + "개, 100원 " + beakwon + "개, 10원 " + tenwon + "개, 1원 " + ilwon + "개");
		
		
		sc.close();		
	}
}
