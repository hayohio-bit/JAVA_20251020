package ex04;

public class PayMain {

	public static void main(String[] args) {

		CreditCard cr = new CreditCard();
		cr.fare(10000);
		System.out.println("-------------------");

		SamsungPay sa = new SamsungPay();
		sa.charge(10000);
	}

}
