package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {
	static ArrayList<Student> students = new ArrayList<>();
	static Scanner input = new Scanner(System.in);
	
	// 입력 메소드
	public static void input() {
		System.out.println("--------------------------------------------\n학생이름, 학과, 학번, 학점평균을 입력하세요. ");
		
		while(true) {			
			System.out.print(">> ");
			String name = input.next();
			
			if (name.equals("그만")) {
				return;
			}
						
			String major = input.next();
			int sno = input.nextInt();
			double scoreAvg = input.nextDouble();
			
			students.add(new Student(name, major, sno, scoreAvg));
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
			
			boolean found = false;
			for(int i = 0; i < students.size(); i++) {
				if(name.equals(students.get(i).getName())) {
					System.out.println(students.get(i));
					found = true;
				}
			}
			if (!found) {
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
