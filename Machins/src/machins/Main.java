/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machins;

import java.util.Scanner;

/**
 *
 * @author kauro
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of iterations");
        int inp = input.nextInt();
        System.out.println("Please enter the value of precision");
        int inp1 = input.nextInt();
        Machins mac = new Machins();
        System.out.println("The answer is " + mac.calculatePi(inp, inp1));
    }
}
