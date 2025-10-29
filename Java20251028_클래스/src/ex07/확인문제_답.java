package ex07;
public class 확인문제_답 {

	public static void main(String[] args) {
	
	dddd user1 = new dddd("홍길동", "hong");
	System.out.println(user1.na);
	System.out.println(user1.ag);
		
	}
}


class dddd {
	String na;
	String i;
	String passw;
	int ag;
	
	dddd(String na, String i){
		this.na = na;
		this.i = i;
}
}