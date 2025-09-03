package ex02;

public class BankAcount {
	private String accountNumber, owner;
	private int balance;
	
	// 생성자
	public BankAcount() {}
	public BankAcount(String accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
	
	// getter & setter
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 입금
	public void deposit(int amount) {
		System.out.println(accountNumber + "에 " + amount + "원 입금했습니다.");
		balance += amount;
	}
	// 출금
	public void withdraw(int amount) {
		if (!chkAmount(amount) || amount > balance) {
			System.out.println("출금액을 잘못 입력했습니다.");			
		} else {
			System.out.println(accountNumber + "에서 " + amount + "원 출금했습니다.");
			balance -= amount;
		}
	}
	
	//
	public boolean chkAmount(int amount) {
		return amount > 0;
	}
	
	// 잔액조회
	public void printBalance() {
		System.out.println(accountNumber + " " + owner + " 잔액은 : " + balance + "원 입니다.");
	}
	// 계좌이체
	public void transfer(int amount, BankAcount otherAccount) {
		if (!chkAmount(amount) || amount > balance) {
			System.out.println("출금액을 잘못 입력했습니다.");
			return;
		} else {			
			this.balance -= amount;
			otherAccount.balance += amount;
			System.out.println(this.accountNumber + "계좌에서 " + otherAccount.getAccountNumber() + "계좌로 " + amount + "원 이체했습니다.");
		}
		
	}

}
