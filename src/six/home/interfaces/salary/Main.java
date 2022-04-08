package six.home.interfaces.salary;

public class Main {
    public static void main(String[] args) {

        WorkerFixedSalary fixed = new WorkerFixedSalary("Андрій", 15000);
        WorkerHourlyWage hourly = new WorkerHourlyWage("Олег", 168, 98.57);

        fixed.salary();
        hourly.salary();
    }
}
