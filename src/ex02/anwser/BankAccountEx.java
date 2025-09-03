package ex02.anwser;

class BankAccount {
    private String accountNumber; // 계좌번호
    private String owner;         // 오너
    private int balance;          // 잔액

    // 생성자
    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    

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

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 입금
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("입금 금액은 0보다 커야 합니다.");
            return;
        }
        balance += amount;
        System.out.println(owner + " 계좌에 " + amount + "원이 입금되었습니다. 현재 잔액: " + balance);
    }

    // 출금
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("출금 금액은 0보다 커야 합니다.");
            return;
        }
        if (amount > balance) {
            System.out.println("잔액이 부족하여 출금할 수 없습니다.");
            return;
        }
        balance -= amount;
        System.out.println(owner + " 계좌에서 " + amount + "원이 출금되었습니다. 현재 잔액: " + balance);
    }

    // 잔액 조회
    public int getBalance() {
        return balance;
    }

    // 계좌 이체
    public void transfer(int amount, BankAccount otherAccount) {
        if (amount <= 0) {
            System.out.println("송금 금액은 0보다 커야 합니다.");
            return;
        }
        if (amount > balance) {
            System.out.println("잔액이 부족하여 송금할 수 없습니다.");
            return;
        }
        this.balance -= amount;
        otherAccount.balance += amount;
        System.out.println(owner + " 계좌에서 " + otherAccount.owner + " 계좌로 " + amount + "원이 송금되었습니다.");
        System.out.println(owner + " 현재 잔액: " + this.balance);
        System.out.println(otherAccount.owner + " 현재 잔액: " + otherAccount.balance);
    }
}
public class BankAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccount account1 = new BankAccount("A001", "Alice", 5000);
	        BankAccount account2 = new BankAccount("A002", "Bob", 3000);

	        // 입금 테스트
	        account1.deposit(2000);

	        // 출금 테스트
	        account2.withdraw(1000);

	        // 잔액 조회
	        System.out.println(account1.getOwner() + " 계좌 잔액: " + account1.getBalance());
	        System.out.println(account2.getOwner() + " 계좌 잔액: " + account2.getBalance());

	        // 계좌 이체 테스트
	        account1.transfer(1500, account2);

	}

}
