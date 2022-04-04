package four.home.imitation.car;

public class CarBody {
    private String color;

    public CarBody (String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarBody [color=" + color + "]";
    }
}
