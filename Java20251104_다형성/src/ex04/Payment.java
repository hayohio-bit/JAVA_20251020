package ex04;

public interface Payment {

	void pay(int amount);

	
}

class CreditCard{
	void fare(int amount) {	//교통요금
		System.out.printf("신용카드로 %d 결제했습니다.\n", amount);
	}
}

class KakaoPay{
	void fee(int amount) {	//서비스요금, 팁
		System.out.printf("카카오페이로 %d 결제했습니다.\n", amount);
	}
}

class SamsungPay{
	void charge(int amount) {	//일반 요금
		System.out.printf("삼성페이로 %d 결제했습니다.\n", amount);
	}
}
