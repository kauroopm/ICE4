
public class Program {

    public static void main(String[] args) {
        Employee X = new Employee("Roop", 27.00, 37.5);
        Manager Y = new Manager("Roopam", 30, 92.00, 1000);
        CEO Z = new CEO("Ruban", 27.9, 30, 1000, 5.7, 7);

        System.out.println("The employee " + X.getName() + "'s pay amount is = " + X.calculatePay());

        System.out.println("The manager's pay amount is = " + Y.calculatePay());

        System.out.println("The CEO's pay amount is = " + Z.calculatePay());

        System.out.println(X);
        System.out.println(Y);
        System.out.println(Z);
    }
}
