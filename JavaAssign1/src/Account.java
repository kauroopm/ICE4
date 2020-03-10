/*
Name: Roopminder Kaur
ID: 991566979
 */

import java.util.Date;

public class Account {

    private String _customerName;// Name of the customer
    private int _ID; // Account ID of Customer
    private double _balance; //Bank balance of Customer
    private double _annualInterestRate; //AnnualInterestRate of customer
    private Date _date; // Date on which account was created

    //get method to obtain current date
    public Date getDate() {
        return _date;
    }

    //Two argument constructor
    public Account(String R, int K) {
        _customerName = R;
        _ID = K;
        _date = new Date();
    }

    //get method to return Customer Name
    public String getCustomerName() {
        return _customerName;
    }

    public void setCustomerName(String customerName) {
        _customerName = customerName;
    }

    //get method to return account ID of customer
    public int getID() {
        return _ID;
    }

    public void setID(int ID) {
        _ID = ID;
    }

    //get method to return bank balance of customer
    public double getBalance() {
        return _balance;
    }

    public void setBalance(double balance) {
        _balance = balance;
    }

    //get method to return annual interest rate of customer
    public double getAnnualInterestRate() {
        return _annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        _annualInterestRate = annualInterestRate;
    }

    //deposit method to add deposit amount in the account
    public double deposit(double value) {
        return _balance += value;
    }

    //withdraw method to subtract the withdraw amount in the account
    public double withdraw(double amount) {
        return _balance -= amount;
    }

    //monthlyInterest method to return monthly interest rate of customer
    public double monthlyInterest() {
        return (((_annualInterestRate / 12) / 100) * _balance);
    }
}
