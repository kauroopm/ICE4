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
public class LibraryTest {

    public static void main(String[] args) {
        //initializing books
        Book book11 = new Book("Problem Solving", "Roland Backhouse", 573);
        Book book12 = new Book("Intro to Java", "Daniel Lang", 1302);
        Book book13 = new Book("Basket Weaving", "Susie Vaughan", 79);
        System.out.println("Information about Catalog");
        System.out.println("Book 1 for Catalog: " + book11.toString());
        System.out.println("Book 2 for Catalog: " + book12.toString());
        System.out.println("Book 3 for Catalog: " + book13.toString());
        System.out.println("Weekly late fee for the first book for Catalog: $" + book11.lateFee());

        //initializing ebooks
        EBook book111 = new EBook("Intro to Java", "Daniel Lang", 1302, "http://lib.com/2454");
        EBook book112 = new EBook("Relaxation Response", "H.Besnson", 62, "http://lib.com/2631");
        EBook book113 = new EBook("War and Peace", "Tolstoy", 1440, "http://lib.com/2776");
        System.out.println("Information about ECatalog");
        System.out.println("Book 1 for ECatalog: " + book111.toString());
        System.out.println("Book 2 for ECatalog: " + book112.toString());
        System.out.println("Book 3 for ECatalog: " + book113.toString());
        System.out.println("Weekly late fee for the first book for ECatalog: $" + book111.lateFee());
    }
}
