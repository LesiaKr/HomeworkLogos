package six.home.interfaces.calculator.second;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator(100, 41);

        MyCalculator.Result(myCalculator.plus());
        MyCalculator.Result(myCalculator.minus());
        MyCalculator.Result(myCalculator.multiply());
        MyCalculator.Result(myCalculator.divide());
    }
}
