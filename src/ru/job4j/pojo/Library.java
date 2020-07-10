package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("book0", 10);
        books[1] = new Book("book1", 20);
        books[2] = new Book("book2", 10);
        books[3] = new Book("Clean code", 464);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        System.out.println("Replace index 0 to 3");
        Book tmp = books[3];
        books[3] = books[0];
        books[0] = tmp;
        for (Book book : books) {
            System.out.println(book.getName());
        }
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName());
            }
        }
    }
}
