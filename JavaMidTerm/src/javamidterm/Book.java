/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamidterm;

/**
 *
 * @author kauro
 */
public class Book {

    protected String title;//Title of the book
    protected String author;//name of the author
    protected int numPages;// no. of pages

    //Constructor to initialize title, auhtor and no. of pages
    public Book(String _title, String _author, int _pages) {
        title = _title;
        author = _author;
        numPages = _pages;
    }

    //method to weekly cal. late fee for Book
    public double lateFee() {
        return (numPages / 100);
    }

    @Override
    public String toString() {
        String str = "Title " + title + ", Author: " + author + ", Number of pages: " + numPages;
        return str;
    }
}
