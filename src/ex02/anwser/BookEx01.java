package ex02.anwser;

class Book {
    private String title;
    private String author;
    private String publisher;
    private String sort;

    // 기본 생성자
    public Book() {
        this.title = "제목없음";
        this.author = "저자없음";
        this.publisher = "출판사없음";
        this.sort = "분류없음";
    }

    // 모든 필드 초기화 생성자
    public Book(String title, String author, String publisher, String sort) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.sort = sort;
    }

    // 제목만 초기화하는 생성자
    public Book(String title) {
        this.title = title;
        this.author = "저자없음";
        this.publisher = "출판사없음";
        this.sort = "분류없음";
    }

    // Getter와 Setter
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public String getSort() { return sort; }
    public void setSort(String sort) { this.sort = sort; }

    // 출력용 메소드
    public void printInfo() {
        System.out.println(title + "\t" + author + "\t" + publisher + "\t" + sort);
    }
    @Override
    public String toString() {
        return title + "\t" + author + "\t" + publisher + "\t" + sort;
    }
}

public class BookEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("82년생 김지영", "조남주", "민음사", "소설");

        // 2. 제목만 초기화하는 생성자
        Book book2 = new Book("파리아파트");
        book2.setAuthor("기욤 뭐소");
        book2.setPublisher("밝은세상");
        book2.setSort("소설");

        // 3. 기본 생성자 + setter
        Book book3 = new Book();
        book3.setTitle("자료구조");
        book3.setAuthor("이자료");
        book3.setPublisher("DB출판사");
        book3.setSort("컴퓨터/IT");

        // 출력
        System.out.println("제목\t저자\t출판사\t분류");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

	}

}
