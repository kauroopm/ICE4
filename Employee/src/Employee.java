
public class Employee {

    protected String _name; // The employee's name
    protected double _hours; // The number of hours worked this pay period
    protected double _hourlySalary; // The employee's hourly salary

    // Constructor
    public Employee(String R, double K, double N) {
        _name = R;
        _hours = K;
        _hourlySalary = N;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setHours(double _hours) {
        this._hours = _hours;
    }

    public void setHourlySalary(double _hourlySalary) {
        this._hourlySalary = _hourlySalary;
    }

    double calculatePay() {
        return (_hours * _hourlySalary);
    }

    @Override
    public String toString() {
        String str = "Name: " + _name + ", Hours: " + _hours + ", Salary: " + _hourlySalary;
        return str;
    }
}
