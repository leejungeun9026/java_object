package ex03;

public class Student {
	private String name, major;
	private int sno;
	private double scoreAvg;
	
	public Student(String name, String major, int sno, double scoreAvg) {
		this.name = name;
		this.major = major;
		this.sno = sno;
		this.scoreAvg = scoreAvg;
	}
	
	// getter
	public String getName( ) {
		return name;
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + major);
		System.out.println("학번 : " + sno);
		System.out.println("학점 평균 : " + scoreAvg);
		System.out.println("------------------------");
	}
}
