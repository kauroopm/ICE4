/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kauro
 */
public class Manager extends Employee {

    protected double _bonus;

    public Manager(String name, double wage, double numHours, double bonus) {
        super(name, wage, numHours);
        _bonus = bonus;
    }

    @Override
    protected double calculatePay() {
        return ((_numHours * _wage) + _bonus);
    }
}
