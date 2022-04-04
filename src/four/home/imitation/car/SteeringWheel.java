package four.home.imitation.car;

public class SteeringWheel {
    private double diameter;
    private String signal;

    public SteeringWheel (double diameter, String signal) {
        this.diameter = diameter;
        this.signal = signal;
    }

    public double doublingDiameter(double diameter) {
        double douDiameter = diameter * 2;
        return douDiameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getSignal() {
        return signal;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setSignal(String signal) {
        this.signal = signal;
    }

    @Override
    public String toString() {
        return "SteeringWheel [diameter=" + diameter + ", signal=" + signal + "]";
    }
}
