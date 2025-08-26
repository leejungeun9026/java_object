package ch03;

public class Diamond {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i+5; j++) {
				if (j < 7 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (11 - i); j++) {
				if (j <= i) {
					System.out.print(" ");
				} else {					
					System.out.print("*");
				}
			}		
			System.out.println();
		}
	}
}
