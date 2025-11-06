package ex03_연습;

public class BookInheritanceExample {
	public static void main(String[] args) {
		
		  Book generalBook = new Book("자바의 정석", "남궁성", 1000);

	        generalBook.displayInfo(); // 일반 책 정보 출력

	        System.out.println("---");

	        Comic manga = new Comic("원피스", "오다 에이이치로", 150, "오다 에이이치로");

	        manga.displayInfo(); // 만화책 정보 출력 (오버라이딩된 메서드)

	        System.out.println("---");

	        Journal scienceJournal = new Journal("네이처", "편집부", 200, 50);

	        scienceJournal.displayInfo(); // 학술지 정보 출력 (오버라이딩된 메서드)
	}

}
