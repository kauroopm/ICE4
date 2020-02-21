
public class Manager extends Employee {

    protected double _bonus;

    public Manager(String R, double K, double N, double bonus) {
        super(R, K, N);
        _bonus = bonus;
    }

    public void setBonus(double _bonus) {
        this._bonus = _bonus;
    }

    @Override
    public double calculatePay() {
        return (super.calculatePay() + _bonus);
    }

    @Override
    public String toString() {
        String str = super.toString() + ", Bonus: " + _bonus;
        return str;
    }
}
