package six.home.interfaces.salary;

public class WorkerHourlyWage extends Worker implements Salary {
    private final int monthWorkerHours;
    private final double hourSalary;

    public WorkerHourlyWage (String name, int monthWorkerHours, double hourSalary){
        super(name);
        this.monthWorkerHours = monthWorkerHours;
        this.hourSalary = hourSalary;
    }

    @Override
    public void salary() {
        double salary = this.monthWorkerHours * this.hourSalary;
        System.out.println("Працівник " + super.getName() + " з погодинною зарплатою заробляє "
                + salary + " грн.");
    }
}
