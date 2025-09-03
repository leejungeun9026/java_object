package ex02;

import java.util.Scanner;

public class BookMain2 {
	public static Scanner input = new Scanner(System.in);
	static int i = 0;

	public static void inputBooks(Book[] books) {
		while (true) {
			if (i >= books.length) {
				System.out.println("더 입력할 수 없습니다.");
				return;
			}

			System.out.print("책 종류 선택 (1. 종이책 | 2. E-book ) >> ");
			String selectNum = input.next();
			input.nextLine();

			if (selectNum.equals("그만")) {
				return;
			} else if (selectNum.equals("1")) {
				System.out.print("책 제목, 저자, 출판사, 분류 >> ");
			} else if (selectNum.equals("2")) {
				System.out.print("책 제목, 저자, 출판사, 분류, 시간, 기계 >> ");
			} else {
				System.out.println("번호를 다시 입력해 주세요.");
				continue;
			}

			String bookData = input.nextLine();
			String[] bookInfo = bookData.split(",");

			switch (selectNum) {
			case "1":
				if (bookInfo.length > 4) {
					System.out.println("입력값이 너무 많습니다.");
					break;
				} else if (bookInfo.length < 4) {
					System.out.println("입력값이 너무 작습니다.");
					break;
				}
				for (int i = 0; i < bookInfo.length; i++) {
					bookInfo[i] = bookInfo[i].trim();
				}
				books[i] = new Book(bookInfo[0], bookInfo[1], bookInfo[2], bookInfo[3]);
				i++;
				if (i == books.length) {
					System.out.println("입력 끝");
					return;
				}
				break;
			case "2":
				if (bookInfo.length > 6) {
					System.out.println("입력값이 너무 많습니다.");
					break;
				} else if (bookInfo.length < 6) {
					System.out.println("입력값이 너무 작습니다.");
					break;
				}

				int[] num = new int[2];
				int numI = 0;
				try {
					for (int i = 0; i < bookInfo.length; i++) {
						bookInfo[i] = bookInfo[i].trim();
						if (i >= 4) {
							num[numI] = Integer.parseInt(bookInfo[i]);
							numI++;
						}
					}
				} catch (NumberFormatException e) {
					System.out.println("시간, 기계는 숫자로 입력해 주세요.");
					numI--;
					break;
				}

				books[i] = new EBook(bookInfo[0], bookInfo[1], bookInfo[2], bookInfo[3], num[0], num[1]);
				i++;
				if (i == books.length) {
					System.out.println("입력 끝");
					return;
				}
				break;
			}
		}

	}

	public static void searchBooks(Book[] books) {

		while (true) {
			System.out.print("검색할 책 제목 입력 >> ");
			String findTitle = input.nextLine();

			if (findTitle.equals("그만")) {
				return;
			}
			boolean flag = false;
			for (Book book : books) {
				if (book != null && findTitle.equals(book.getTitle())) {
					System.out.println(book);
					flag = true;
				}
			}
			if (!flag) {
				System.out.println("일치하는 책이 없습니다.");
			}
		}

	}

	public static void allBooks(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
		return;
	}

	public static void main(String[] args) {
		Book[] books = new Book[5];

		while (true) {
			System.out.print("1.데이터 입력 | 2.데이터 조회 | 3.전체 데이터 출력 | 4.종료 >> ");
			int num = input.nextInt();
			input.nextLine();

			switch (num) {
			case 1:
				inputBooks(books);
				break;
			case 2:
				searchBooks(books);
				break;
			case 3:
				allBooks(books);
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			default:
			}
		}

	}

}
