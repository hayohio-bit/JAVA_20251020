package ex13;

public class Student {

	private String name; // 학생이름
	private int ban; // 반
	private int no; // 번호
	private int kor; // 국어점수
	private int eng; // 영어점수
	private int math; // 수학점수
	
	//getter
	public String getName() {
		return name;
	}
	
	
	//클래스 만들면 생성자 넣어주세요
	Student(){
		
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public float getAverage() {
		//float avg = getTotal()/3.0f;
		float avg = Math.round(getTotal()/3.0f*100)/100.0f;
	
	//public double getAverage() {
		//double avg = getTotal()/3.0f;

		return avg;
	}
	public float getAverage2() {
		float avg =getTotal()/3.0f;
		return avg;
	}
	
	public float getAverage3() {
		float avg = Math.round(getTotal()/3.0f*10)/10.0f;
		return avg;
	}
			
	public String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage3();
	}
}