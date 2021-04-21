package com.tts;

public class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        // Implement this method
        title = bookTitle;
        borrowed = false;
    }

    public void rented(){
        borrowed = true;
    }

    // Marks the book as rented
    public void borrowed() {
        // Implement this method
    }

    // Marks the book as not rented
    public void returned() {
        // Implement this method
        borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
        return this.borrowed;

    }

    // Returns the title of the book
    public String getTitle() {
        // Implement this method

        return title;
    }


}