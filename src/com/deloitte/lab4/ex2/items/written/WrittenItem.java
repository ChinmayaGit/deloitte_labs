package com.deloitte.lab4.ex2.items.written;

import com.deloitte.lab4.ex2.items.Item;

public abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(int id, String title, int numOfCopies, String author) {
        super(id, title, numOfCopies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }
}
