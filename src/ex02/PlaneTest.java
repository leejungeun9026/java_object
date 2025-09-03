package ex02;

public class PlaneTest {

	public static void main(String[] args) {
		Plane p1 = new Plane("에어버스", "A380", 500);
		Plane p2 = new Plane("보잉", "747", 200);
		Plane p3 = new Plane("제트기", "A200", 2);
		Plane p4 = new Plane("에어버스", "A310", 100);
		Plane p5 = new Plane("보잉", "737", 480);

		// 설정자 호출
		p2.setModel("A3090");
		
		// 접근자 호출
		System.out.println(p2.getModel() + " " + p2.getSeat());
		
		// Planes 호출
		System.out.println("총 비행기는 : " + Plane.getPlanes() + "대");
	}
}
