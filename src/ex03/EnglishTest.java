package ex03;

import java.util.Scanner;
import java.util.Vector;

class Word {
	private String eng, kor;

	public Word() {
	}

	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

}

public class EnglishTest {
	static Vector<Word> words = new Vector<>();
	static Scanner input = new Scanner(System.in);
	
	
	public static void initWord() {
		words.add(new Word("painting", "그림"));
		words.add(new Word("bear", "곰"));
		words.add(new Word("eye", "눈"));
		words.add(new Word("society", "사회"));
		words.add(new Word("animal", "동물"));
		words.add(new Word("baby", "아기"));
		words.add(new Word("emotion", "감정"));
		words.add(new Word("flag", "깃발"));
		words.add(new Word("friend", "친구"));
		words.add(new Word("computer", "컴퓨터"));
	}
	

	public static void startTest() {
		if (words.size() == 0) {
			System.out.println("현재" + words.size() + "개의 단어가 들어가있습니다. 단어를 먼저 삽입해 주세요.");
			return;
		}
		System.out.println("현재" + words.size() + "개의 단어가 들어가있습니다. -1을 입력하면 테스트를 종료합니다.");

		// 난수 4개 배열 생성
		int[] arr = new int[4];

		while (true) {
			// 중복되지 않는 수를 배열에 저장
			for (int i = 0; i < arr.length; i++) {
				int rNum = (int) (Math.random() * words.size());
				boolean same = false;
				for (int j = 0; j < i; j++) {
					if (arr[j] == rNum) {
						same = true;
						i--;
						break;
					}
				}
				if (!same) {
					arr[i] = rNum;
					continue;
				}
			}

			// 배열 4개 중 1개 영어 단어 출력
			int index = (int) (Math.random() * arr.length);
			System.out.println(words.get(arr[index]).getEng() + "?");

			// 객관식 답 4개 출력
			for (int i = 0; i < arr.length; i++) {
				System.out.print((i + 1) + ")" + words.get(arr[i]).getKor() + "\t");
			}			
			System.out.print("\n정답 입력 >> ");
			// 정답 입력
			int answer = input.nextInt();

			// 정답에 따른 결과 출력
			if (answer == -1) {
				return;
			} else if ((answer - 1) == index) {
				System.out.println("✅ Excellent !!");
				System.out.println("--------------------------------------------");
				continue;
			} else {
				System.out.println("❌ No !!");
				System.out.println("--------------------------------------------");
				continue;
			}
		}

	}

	public static void inputWord() {
		System.out.println("영어 단어에 그만을 입력하면 종료합니다.");
		while (true) {
			System.out.print("영어 한글 입력 >> ");
			String eng = input.next();

			if (eng.equals("그만"))
				return;

			String kor = input.next();
			words.add(new Word(eng, kor));
		}
	}
	
	public static void run() {
		System.out.println("********** 영어 단어 테스트 프로그램 ************");
		System.out.println("영어단어의 테스트를 시작합니다.");
		while (true) {
			System.out.print("1. 단어 테스트 | 2. 단어 삽입 | 3. 종료 >> ");
			int num = input.nextInt();

			switch (num) {
			case 1:
				startTest();
				break;
			case 2:
				inputWord();
				break;
			case 3:
				System.out.println("영어 단어 게임을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력했습니다.");
			}
		}
	}

	public static void main(String[] args) {
		initWord();
		run();		
	}
}
