package prob05;

public class Account {
	
	//2개의 데이터 
	private String accountNo;
	private int balance;
	
	public Account(String a){ //생성자
		accountNo=a;
		balance=0;
	}
	public String getAccountNo() { //계좌번호 
		return accountNo;
	}
	public void setAccountNo(String accountNo) {//계좌번호 대입
		this.accountNo = accountNo;
	}
	public int getBalance() { //잔고확인
		return balance;
	}
	public void setBalance(int balance) { //남아있는 금액 대입 
		this.balance = balance;
	}
	public int save(int a){ //입금
		balance+=a;
		return balance;
	}
	public int deposit(int a){ //출금
		balance-=a;
		return balance;
	}
	
}
