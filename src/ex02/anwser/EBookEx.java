package ex02.anwser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class EBook extends Book {
    private int service_time;     // 유효기간
    private int service_machines; // 사용기기수

    // 기본 생성자
    public EBook() {
        super();
        this.service_time = 0;
        this.service_machines = 0;
    }

    // 모든 필드 초기화 생성자
    public EBook(String title, String author, String publisher, String sort,
                 int service_time, int service_machines) {
        super(title, author, publisher, sort);
        this.service_time = service_time;
        this.service_machines = service_machines;
    }

    // Getter/Setter
    public int getService_time() { return service_time; }
    public void setService_time(int service_time) { this.service_time = service_time; }

    public int getService_machines() { return service_machines; }
    public void setService_machines(int service_machines) { this.service_machines = service_machines; }

    @Override
    public String toString() {
        return super.toString() + "\t" + service_time + "\t" + service_machines;
    }
}

public class EBookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        HashMap<String, ArrayList<Book>> map = new HashMap<>();

        boolean run = true;
        while (run) {
            System.out.print("1. 데이터입력 | 2. 데이터조회 | 3. 전체데이터출력 | 4. 종료 >> ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1": // 데이터 입력
                    while (true) {
                        System.out.print("책의 종류 선택 (1. 종이책, 2. EBook) >> ");
                        String type = sc.nextLine();
                        if (type.equals("그만")) break;

                        if (type.equals("1")) { // 종이책
                            System.out.print("책제목, 저자, 출판사, 분류 입력 >> ");
                            String[] data = sc.nextLine().split(",");
                            if (data.length != 4) {
                                System.out.println("입력 형식이 잘못되었습니다.");
                                continue;
                            }
                            Book book = new Book(data[0].trim(), data[1].trim(), data[2].trim(), data[3].trim());
                            list.add(book);
                            map.computeIfAbsent(book.getTitle(), k -> new ArrayList<>()).add(book);

                        } else if (type.equals("2")) { // EBook
                            System.out.print("책제목, 저자, 출판사, 분류, 유효기간, 사용기기수 입력 >> ");
                            String[] data = sc.nextLine().split(",");
                            if (data.length != 6) {
                                System.out.println("입력 형식이 잘못되었습니다.");
                                continue;
                            }
                            EBook ebook = new EBook(
                                    data[0].trim(),
                                    data[1].trim(),
                                    data[2].trim(),
                                    data[3].trim(),
                                    Integer.parseInt(data[4].trim()),
                                    Integer.parseInt(data[5].trim())
                            );
                            list.add(ebook);
                            map.computeIfAbsent(ebook.getTitle(), k -> new ArrayList<>()).add(ebook);

                        } else {
                            System.out.println("잘못된 선택입니다.");
                        }
                    }
                    break;

                case "2": // 데이터 조회
                    while (true) {
                        System.out.print("검색할 책제목 입력 >> ");
                        String title = sc.nextLine();
                        if (title.equals("그만")) break;

                        ArrayList<Book> books = map.get(title);
                        if (books == null) {
                            System.out.println("검색 결과가 없습니다.");
                        } else {
                            for (Book b : books) {
                                System.out.println(b.toString());
                            }
                        }
                    }
                    break;

                case "3": // 전체 데이터 출력
                    for (Book b : list) {
                        System.out.println(b.toString());
                    }
                    break;

                case "4": // 종료
                    System.out.println("프로그램 종료");
                    run = false;
                    break;

                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
        sc.close();

	}

}
