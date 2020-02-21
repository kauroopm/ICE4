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
public class EBook extends Book {

    protected String URL;//web address of EBook

    //Constructor to initialize URL also
    public EBook(String _title, String _author, int _pages, String _URL) {
        super(_title, _author, _pages);
        URL = _URL;
    }

    //method to weekly cal. late fee for EBook
    public double lateFee() {
        return (0.0);
    }

    @Override
    public String toString() {
        String str = super.toString() + ", Web Address: " + URL;
        return str;
    }
}
