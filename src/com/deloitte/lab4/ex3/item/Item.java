package com.deloitte.lab4.ex3.item;

public abstract class Item {
    private int id;
    private String title;
    private int numOfCopies;

    public Item(int id, String title, int numOfCopies) {
        this.id = id;
        this.title = title;
        this.numOfCopies = numOfCopies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    public void checkIn() {
        numOfCopies++;
    }

    public void checkOut() {
        if (numOfCopies > 0) {
            numOfCopies--;
        } else {
            System.out.println("No copies left to check out.");
        }
    }

    public void addItem(int copies) {
        this.numOfCopies += copies;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return id == item.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Copies: " + numOfCopies;
    }

    public abstract void print();
}
