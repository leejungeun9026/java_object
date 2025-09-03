package ex02;

public class BankAcountMain {

	public static void main(String[] args) {
		// 계좌 2개 생성
		BankAcount acount1 = new BankAcount("123-456", "hong", 5000);
		BankAcount acount2 = new BankAcount("789-012", "kim", 2000);
		
		// acount1 입금 및 잔액조회
		acount1.deposit(5000);
		acount1.printBalance();
		System.out.println();

		// acount1 출금 및 잔액조회
		acount1.withdraw(2000);
		acount1.printBalance();
		System.out.println();
		
		// acount1 계좌이체 및 잔액조회
		acount1.transfer(300, acount2);
		acount1.printBalance();
		System.out.println();
		
		// acount2 잔액 조회
		acount2.printBalance();		
	}
}
