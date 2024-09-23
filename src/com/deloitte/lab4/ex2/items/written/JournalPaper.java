package com.deloitte.lab4.ex2.items.written;

public class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int id, String title, int numOfCopies, String author, int yearPublished) {
        super(id, title, numOfCopies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year Published: " + yearPublished;
    }

    @Override
    public void print() {
        System.out.println("Journal Paper: " + toString());
    }
}
