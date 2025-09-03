package ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex01 {
	static Scanner input = new Scanner(System.in);
	static HashMap<String, Integer> nations = new HashMap<>();
	
	// 나라 입력 메서드
	static void input() {
		System.out.println("나라 이름과 인구를 입력하세요 (예 : Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String name = input.next();
			
			if(name.equals("그만")) {
				System.out.println("입력 종료...");
				return;
			}
			
			int population = input.nextInt();			
			nations.put(name, population);
		}
	}
	
	// 나라 검색 메서드
	static void search() {
		while(true) {			
			System.out.print("인구 검색 >> ");
			String name = input.next();
			
			if(name.equals("그만")) {
				System.out.println("검색 종료");
				break;
			}
			
			Set<String> keys = nations.keySet(); // 키를 set으로 변경
			Iterator<String> values = keys.iterator();
			
			boolean found = false;
			while(values.hasNext()) {
				String key = values.next();
				if (name.equals(key)) {
					System.out.println(key + " " + nations.get(key));
					found = true;
				}
			}
			if (!found) {
				System.out.println(name + " 나라는 없습니다.");
				continue;
			}
			
		}

	}

	public static void main(String[] args) {
		while(true) {			
			System.out.print("1. 입력 | 2. 검색 | 3. 종료 >> ");
			int num = input.nextInt();
			
			switch(num) {
			case 1 : input();
			break;
			case 2 : search();
			break;
			case 3 : System.out.println("End");
			return;
			default :
			}
		}
		
		
	}
	
}
