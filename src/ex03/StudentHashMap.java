package ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentHashMap {
	static HashMap<String, Student> students = new HashMap<>();
	static Scanner input = new Scanner(System.in);
	
	// 입력 메소드
	public static void input() {
		System.out.println("--------------------------------------------\n학생이름, 학과, 학번, 학점평균을 입력하세요. ");
		
		while(true) {			
			System.out.print(">> ");
			String name = input.next();
			
			if (name.equals("그만")) {
				System.out.println("--------------------------------------------");
				return;
			}
						
			String major = input.next();
			int sno = input.nextInt();
			double scoreAvg = input.nextDouble();
			
			students.put(name, new Student(name, major, sno, scoreAvg));
		}
	}
	
	// 출력 메소드
	public static void search() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = input.next();
			
			if(name.equals("그만")) {
				System.out.println("검색 종료");
				return;
			}
			
			Set<String> keys = students.keySet();
			Iterator<String> it = keys.iterator();
			
			
			boolean found = false;
			while(it.hasNext()) {
				String key = it.next();
				if(name.equals(key)) {
					students.get(key).print();
					found = true;
				}
			}
			if(!found) {
				System.out.println("찾는 학생이 없습니다.");
			}
		}
	}
	

	public static void main(String[] args) {
		
		while(true) {
			System.out.print("1. 입력 | 2. 출력 | 3. 종료 >> ");
			int num = input.nextInt();
			
			switch(num) {
			case 1 : input();
				break;
			case 2 : search();
				break;
			case 3 : System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못 입력했습니다.");
				continue;
			}
		}
	}
}
