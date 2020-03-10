/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kauro
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Employee emp = new Employee("Roop", 23.6, 8.5);
     Manager man = new Manager("Ruban", 45.3, 3.8, 26.4);
     
        System.out.println("The payCheque of Employee is: " +emp.calculatePay());
        System.out.println("The payCheque of Manager is: " +man.calculatePay());
    }
    
}
