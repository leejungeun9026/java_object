package ch06;

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
	
	// method
	public int deposit(int amount) {
		System.out.println(amount + "원 입금했습니다.");
		return balance += amount;
	}
	public int withdraw(int amount) {
		if (amount > balance) {
			System.out.println("출금액이 부족합니다.");
			return balance;
		} else {
			System.out.println(amount + "원 출금했습니다.");
			return balance -= amount;
		}
	}
	public void printBalance() {
		System.out.println(accountNumber + " " + owner + " 잔액은 : " + balance + "원 입니다.");
	}
	public int transfer(int amount, BankAcount otherAccount) {
		this.withdraw(amount);
		otherAccount.deposit(amount);
		System.out.println(this.accountNumber + "계좌에서 " + otherAccount.getAccountNumber() + "계좌로 " + amount + "원 이체했습니다.");
		return balance;
	}

}
