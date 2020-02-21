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
public class Catalog {

    // creates objects of Book
    protected Book _Book1;
    protected Book _Book2;
    protected Book _Book3;

    //Constructor to initialize Books
    public Catalog(Book book1, Book book2, Book book3) {
        _Book1 = book1;
        _Book2 = book2;
        _Book3 = book3;
    }

    //method to cal. no. of pages 
    private int totalPages() {
        int total = _Book1.numPages + _Book2.numPages + _Book3.numPages;
        return total;
    }

    @Override
    public String toString() {
        String str = "Book1: " + _Book1 + "\n Book2: " + _Book2 + "\n Book3: " + _Book3;
        return str;
    }
}
