package ex02;

public class BookMain {

	public static void main(String[] args) {		
		// 기본 생성자로 작성하기
		Book book1 = new Book();
		book1.setTitle("82년생 김지영");
		book1.setAuthor("조남주");
		book1.setPublisher("민음사");
		book1.setSort("소설");
		
		// 제목만 초기화 하는 생성자로 작성하기
		Book book2 = new Book("파리아파트");
		book2.setAuthor("기욤뮈소");
		book2.setPublisher("밝은세상");
		book2.setSort("소설");
		
		// 모두 초기화하는 생성자로 작성하기
		Book book3 = new Book("자료구조", "이자료", "DB출판사", "컴퓨터/IT");
		
		// 출력
		System.out.println("제목\t\t저자\t\t출판사\t\t분류");
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
	}
}
