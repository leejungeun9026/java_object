package ch06;

import java.util.Scanner;

public class BookMain2 {
	public static Scanner input = new Scanner(System.in);
	static int i = 0;
	
	public static void inputBooks(Book[] books) {		
		while(true) {
			System.out.print("책 종류 선택 (1. 종이책 | 2. E-book ) >> ");			
			String selectNum = input.next();

			if (selectNum.equals("그만")) {		
				return;
			} else if(selectNum.equals("1") || selectNum.equals("2")) {
				System.out.print("책 제목 >> ");
				input.next();
				String title = input.nextLine();
				System.out.print("저자 >> ");
				String author = input.next();
				System.out.print("출판사 >> ");
				String publisher = input.next();
				System.out.print("분류 >> ");
				String sort = input.next();
				
				switch(selectNum) {
				case "1" :
					books[i] = new Book(title, author, publisher, sort);
					if () {
						System.out.println("입력 끝");
						return;
					} 
					i++;
					break;
				case "2" : 
					System.out.print("서비스 기간 >> ");
					int service_time = input.nextInt();
					System.out.print("서비스 기계 >> ");
					int service_machines = input.nextInt();
					books[i] = new EBook(title, author, publisher, sort, service_time, service_machines);
					if (i == 4) {
						System.out.println("입력 끝");
						return;
					}
					i++;
					break;
				}
			} else {
				System.out.println("번호를 다시 입력해 주세요.");
				continue;	
			}
		}
		
	}
	
	
	public static void searchBooks(Book[] books) {
		System.out.print("검색할 책 제목 입력 >> ");
		input.next();
		String title = input.nextLine();
		
		boolean flag = false;
		for (Book b : books) {
			if (title.equals(b.getTitle())) {				
				System.out.println(b);
				flag = true;
			} else {
				continue;
			}
		}
		if(!flag) {
			System.out.println("일치하는 책이 없습니다.");
		}
		
	}
	

	public static void main(String[] args) {
		Book[] books = new Book[5];
		

		
		while(true) {
			System.out.print("1.데이터 입력 | 2.데이터 조회 | 3.전체 데이터 출력 | 4.종료 >> ");
			int num = input.nextInt();
			
			switch(num) {
			case 1 : inputBooks(books);
				break;
			case 2 : searchBooks(books);
				break;
			case 3 : 
				break;
			case 4 : 
				System.out.println("프로그램 종료");
				return;
			default :
			}
		}
		
	}
	
	
}
