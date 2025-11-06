package ex03_연습;

class Journal extends Book {

    int volume; // 학술지의 경우 권(volume) 추가

    public Journal(String title, String author, int pages, int volume) {

        super(title, author, pages); // 부모 클래스(Book)의 생성자 호출 ((11))

        this.volume = volume;

    }

    @Override // 메서드 오버라이딩

    public void displayInfo() {

        super.displayInfo(); // 부모 클래스의 displayInfo() 호출

        System.out.println("권: " + volume);

    }

}