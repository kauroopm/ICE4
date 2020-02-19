/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 *
 * @author kauro
 */
public class PasswordValidator {

    private User users[] = new User[100];//room for 100 online players!

    protected void run() {
        int userCount = 0;//keep track of number of users for array
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter user name:");
        String userName = sc.nextLine();
        boolean validPassword = false;
        String password = "";
        while (!validPassword) {
            System.out.println("Passwords must have at least 8 characters");
            System.out.println("Passwords must have at least one special character");
            System.out.println("Please enter your desired password:");

            password = sc.nextLine();
            int specialCharCount = 0;
            //iterate over each character to see if it is a special character
            for (int i = 0; i < password.length(); i++) {
                if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if (specialCharCount > 0 && password.length() > 7) {
                validPassword = true;
            }
        }//loop only ends when password is valid so now we create the User

        User newUser = new User(userName, password);
        users[userCount] = newUser;//add the new user to the user list
        userCount++;
        System.out.println("New User Added");
        System.out.println("UserName: " + userName);
        System.out.println("Password: Your password is saved, but for security reasons we can't show it.");
        System.out.println("Now you can play UnoOnline anytime with your saved username and password.");
    }
}
