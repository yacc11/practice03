package prob05;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account( "078-3762-293" ); //객체 생성 및 초기화
		
		System.out.println( account.getAccountNo() + "계좌의 잔고는 " + account.getBalance() + "만원입니다." );
		
		account.save( 100 ); //100만원 입금 
		System.out.println( account.getAccountNo() + "계좌의 잔고는 " + account.getBalance() + "만원입니다." );

		account.deposit( 30 ); //30만원 출금
		System.out.println( account.getAccountNo() + "계좌의 잔고는 " + account.getBalance() + "만원입니다." );

	}

}
