package ex03;

import java.util.Scanner;
import java.util.Vector;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Vector<Integer> rain = new Vector<>();
		int rainTotal = 0;
		int rainAvg = 0;
		
		while(true) {			
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			int rainfall = input.nextInt();
			
			if(rainfall == 0) {
				System.out.println("End");
				break;
			}			
			
			// 현재 강수량 삽입
			rain.add(rainfall);
			rainTotal += rainfall; 

			// 강수량 전체 출력
			for(int i = 0; i < rain.size(); i++) {
				System.out.print(rain.get(i) + " ");
			}
			System.out.println();			
			
			// 평균 출력
			rainAvg = (rainTotal/rain.size());			
			System.out.println("현재 평균 : " + rainAvg);
		}

		input.close();
	}
}
