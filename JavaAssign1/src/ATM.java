/*
Name: Roopminder Kaur
ID: 991566979
 */

import java.util.Scanner;//import statement of Scanner
import java.text.SimpleDateFormat;//import statement of Date to get date and time on which account was created

public class ATM {

    private static String[] x;

    public static void main(String[] args) { //main method 
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter an ID:");
            int x = input.nextInt();

            Account[] acc = new Account[2];
            acc[0] = new Account("Roopminder", 101);
            acc[1] = new Account("Kapil", 102);

            acc[0].setBalance(50);
            acc[0].setAnnualInterestRate(5);
            acc[1].setBalance(1000);
            acc[1].setAnnualInterestRate(5);

            if (x != 101 && x != 102) {
                System.out.println("Invalid ID, Please enter right ID.");
            } else {
                System.out.println("");
                if (x == 101) {
                    ATM.menu(acc[0]);
                } else if (x == 102) {
                    ATM.menu(acc[1]);
                }

            }

        }
    }

    public static void menu(Account acc) { //menu method in which account information of customer is created
        while (true) {
            System.out.println("");
            System.out.println("Main Menu");
            System.out.println("1: Account Info");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");
            System.out.println("");
            Scanner menu = new Scanner(System.in);

            System.out.println("Please choose what you would like to do: ");
            int R = menu.nextInt();

            switch (R) {
                case 1:
                    //account information of customer
                    SimpleDateFormat RK = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");//Object of date is created
                    System.out.println("Customer Name: " + acc.getCustomerName());//calling and printing customer name using get method
                    System.out.println("Account Balance: $" + acc.getBalance());//calling and printing customer bank balance using get method
                    System.out.printf("Monthly Interest earned: $ %.2f\n", acc.monthlyInterest());//calling and printing monthly interest of customer using get method
                    System.out.println("Date on which account was created: " + RK.format(acc.getDate()));//calling and printing date on which account was created using get method
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: $");
                    int s = menu.nextInt();
                    acc.withdraw(s);//calling withdraw method
                    break;

                case 3:
                    System.out.print("Enter the amount to deposit: $");
                    int p = menu.nextInt();
                    acc.deposit(p);//calling deposit method
                    break;

                case 4:
                    ATM.main(x);//calling main method

            }

        }
    }

}
