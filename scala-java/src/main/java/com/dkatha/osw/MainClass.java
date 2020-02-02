package com.dkatha.osw;

public class MainClass {

    public static void main(String[] args) {
        BookStorage storage = new BookStorage();
        storage.getBooks().stream().forEach((Book b) -> System.out.println(b));
    }

}
