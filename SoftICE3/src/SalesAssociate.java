/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kauro
 */
public class SalesAssociate extends Employee {

    protected double _vacPay;

    public SalesAssociate(String name, double wage, double numHours, double vacPay) {
        super(name, wage, numHours);
        _vacPay = vacPay;
    }

    @Override
    protected double calculatePay() {
        return (super.calculatePay() + _vacPay);
    }
}
