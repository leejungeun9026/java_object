package ex02.anwser;


class Plane {
    // 1. 필드 정의 (private)
    private String manufacturer; // 제작사
    private String model;        // 모델
    private int maxPassengers;   // 최대 승객 수

    // 6. 정적 변수: 지금까지 생성된 비행기 수
    private static int planes = 0;

    // 3-1. 기본 생성자
    public Plane() {
        this.manufacturer = "Unknown";
        this.model = "Unknown";
        this.maxPassengers = 0;
        planes++; // 생성될 때마다 증가
    }

    // 3-2. 모든 필드 초기화 생성자
    public Plane(String manufacturer, String model, int maxPassengers) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxPassengers = maxPassengers;
        planes++; // 생성될 때마다 증가
    }

    // 2. Getter/Setter
    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getMaxPassengers() { return maxPassengers; }
    public void setMaxPassengers(int maxPassengers) { this.maxPassengers = maxPassengers; }

    // 7. 정적 메소드: 생성된 비행기 수 반환
    public static int getPlanes() { return planes; }

    // 출력용 메소드
    public void printInfo() {
        System.out.println("제작사: " + manufacturer + ", 모델: " + model + ", 최대 승객수: " + maxPassengers);
    }
}
public class PlaneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Plane p1 = new Plane();
	        p1.printInfo();

	        // 모든 필드 초기화 생성자 사용
	        Plane p2 = new Plane("에어버스", "A380", 500);
	        p2.printInfo();

	        Plane p3 = new Plane("보잉", "747", 400);
	        p3.printInfo();

	        // 접근자/설정자 테스트
	        p1.setManufacturer("보잉");
	        p1.setModel("737");
	        p1.setMaxPassengers(300);
	        System.out.println("수정된 p1 정보:");
	        System.out.println("제작사: " + p1.getManufacturer() + ", 모델: " + p1.getModel() + ", 최대 승객수: " + p1.getMaxPassengers());

	        // 정적 변수 테스트
	        System.out.println("지금까지 생성된 비행기 수: " + Plane.getPlanes());

	}

}
