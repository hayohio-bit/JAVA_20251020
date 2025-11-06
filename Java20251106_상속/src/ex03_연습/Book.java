package ex03_연습;

class Book {

    String title;

    String author;

    int pages;

    public Book(String title, String author, int pages) {

        this.title = title;

        this.author = author;

        this.pages = pages;

    }

    public void displayInfo() {

        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + pages);

    }

}