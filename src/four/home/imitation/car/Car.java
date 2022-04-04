package four.home.imitation.car;

public class Car {
    private int enginePower;
    private String fuelType;
    private SteeringWheel steeringWheel;
    private Wheel wheel;
    private CarBody carBody;

    public Car(int enginePower, String fuelType, SteeringWheel steeringWheel, Wheel wheel, CarBody carBody) {
        this.enginePower = enginePower;
        this.fuelType = fuelType;
        this.steeringWheel = steeringWheel;
        this.wheel = wheel;
        this.carBody = carBody;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getDiameter() {
        return steeringWheel.getDiameter();
    }

    public String getSignal() {
        return steeringWheel.getSignal();
    }

    public double getDiskDiameter() {
        return wheel.getDiskDiameter();
    }

    public int getTireSize() {
        return wheel.getTireSize();
    }

    public String getSeason() {
        return wheel.getSeason();
    }

    public String getColor() {
        return carBody.getColor();
    }

    @Override
    public String toString() {
        return "Car [enginePower=" + enginePower + ", fuelType=" + fuelType + ", steeringWheelDiameter=" + getDiameter() +
                ", steeringWheelSignal=" + getSignal() + ", wheelDiskDiameter=" + getDiskDiameter() + ", wheelTireSize=" +
                getTireSize() + ", wheelSeason=" + getSeason() + ", color=" + getColor() + "]";
    }
}
