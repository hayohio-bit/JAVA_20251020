package ex12;

public class Account {
	
	private int balance;
	
	public static final int MIN_BALANCE=0;
	public static final int MAX_BALANCE=1000000;
	
	public Account() {
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {

		if(balance>= MIN_BALANCE && balance<= MAX_BALANCE) {
			this.balance = balance;
		}
	}	

}

/*
 * 1. balance 필드는 음수값이 될 수 없고, 최대 백만 원까지만 저장할 수 있다.
 * 		Setter의 매개값이 음수이거나 백만 원을 초과하면 현재 balance 값을 유지
 * 2. 외부에서 balance 필드를 마음대로 변경할 수 없다.
 */