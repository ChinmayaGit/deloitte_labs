package com.deloitte.lab4.ex3;

import com.deloitte.lab4.ex3.media.CD;
import com.deloitte.lab4.ex3.media.Video;
import com.deloitte.lab4.ex3.written.Book;
import com.deloitte.lab4.ex3.written.JournalPaper;

public class LibraryDemo {
    public static void main(String[] args) {
        Book book = new Book(1, "Effective Java", 5, "Joshua Bloch");
        JournalPaper journal = new JournalPaper(2, "AI Research", 3, "John Doe", 2020);
        Video video = new Video(3, "Inception", 2, 148, "Christopher Nolan", "Sci-Fi", 2010);
        CD cd = new CD(4, "Abbey Road", 4, 47, "The Beatles", "Rock");

        book.print();
        journal.print();
        video.print();
        cd.print();

        book.checkOut();
        book.print();
        book.checkIn();
        book.print();
    }
}
