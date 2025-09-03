package ex02;

public class Plane {
	private static int planes = 0;
	private String company, model;
	private int seat;
	
	// 생성자
	public Plane() {
		planes++;
	}	
	public Plane(String model) {
		this.model = model;
		planes++;
	}
	public Plane(int seat) {
		this.seat = seat;
		planes++;
	}
	public Plane(String company, String model, int seat) {
		this.company = company;
		this.model = model;
		this.seat = seat;
		planes++;
	}
	
	
	// 접근자와 설정자
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public static int getPlanes() {
		return planes;
	}
	
}
