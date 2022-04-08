package six.home.interfaces.calculator.second;

import six.home.interfaces.calculator.first.Numerable;

public class MyCalculator implements Numerable {
    double a;
    double b;

    public MyCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double divide() {
        return this.a / this.b;
    }

    @Override
    public double minus() {
        return this.a - this.b;
    }

    @Override
    public double multiply() {
        return this.a * this.b;
    }

    @Override
    public double plus() {
        return this.a + this.b;
    }

    static void Result(double result) {
        System.out.println("Результат операції дорівнює: " + result);
    }
}
