package four.home.imitation.car;

public class Wheel {
    private double diskDiameter;
    private int tireSize;
    private String season;

    public Wheel(double diskDiameter, int tireSize, String season) {
        this.diskDiameter = diskDiameter;
        this.tireSize = tireSize;
        this.season = season;
    }
    public double plusDiameter(double diskDiameter){
        double plusDisk = diskDiameter + 2;
        return plusDisk;
    }
    public int sizeTire(int tireSize){
        int size = tireSize + 5;
        return size;
    }

    public double getDiskDiameter() {
        return diskDiameter;
    }

    public int getTireSize() {
        return tireSize;
    }

    public String getSeason() {
        return season;
    }

    public void setDiskDiameter(double diskDiameter) {
        this.diskDiameter = diskDiameter;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Wheel [diskDiameter=" + diskDiameter + ", tireSize=" + tireSize + ", season=" + season + "]";
    }
}
