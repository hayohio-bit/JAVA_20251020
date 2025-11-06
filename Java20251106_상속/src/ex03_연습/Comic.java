package ex03_연습;

class Comic extends Book {

    String illustrator; // 만화책의 경우 삽화가 추가

    public Comic(String title, String author, int pages, String illustrator) {

        super(title, author, pages); // 부모 클래스(Book)의 생성자 호출 ((11))

        this.illustrator = illustrator;

    }

    @Override // 메서드 오버라이딩

    public void displayInfo() {

        super.displayInfo(); // 부모 클래스의 displayInfo() 호출

        System.out.println("삽화가: " + illustrator);

    }

}