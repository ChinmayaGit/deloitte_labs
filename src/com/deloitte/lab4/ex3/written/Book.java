package com.deloitte.lab4.ex3.written;

public class Book extends WrittenItem {

    public Book(int id, String title, int numOfCopies, String author) {
        super(id, title, numOfCopies, author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + toString());
    }
}
