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
        Manager man = new Manager("Ruban", 45.3, 8.8, 26.4, 456.8);
        SalesAssociate sal = new SalesAssociate("Roopam", 34.7, 8.9, 4567);

        System.out.printf("The payCheque of " + emp.getname() + " is: %.2f\n ", emp.calculatePay());
        System.out.printf("The payCheque of " + man.getname() + " is: %.2f\n ", man.calculatePay());
        System.out.printf("The payCheque of " + sal.getname() + " is: %.2f\n ", sal.calculatePay());
    }
}
