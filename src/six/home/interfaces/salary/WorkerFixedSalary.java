package six.home.interfaces.salary;

public class WorkerFixedSalary extends Worker implements Salary {
    private final double monthSalary;
    public WorkerFixedSalary(String name, double monthSalary) {
        super(name);
        this.monthSalary = monthSalary;
    }

    @Override
    public void salary() {
        double salary = this.monthSalary;
        System.out.println("Працівник " + super.getName() + " з фіксованою місячною зарплатою заробляє "
                + salary + " грн.");
    }
}
