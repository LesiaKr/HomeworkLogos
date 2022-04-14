package six.home.interfaces.salary;
// 1. Створити interface Зарплата, в якому передбачити метод зарплата(). Створити клас Працівник з погодинною 
//зарплатою, та Працівник з фіксованою місячною зарплатою .
//Реалізувати методи інтерфейсу в к класах :
//Працівник з погодинною зарплатою, та Працівник з фіксованою місячною зарплатою .
//Формула розрахунку зарплати працівника є довільною.
//Вивести на екран скільки заробляють перший і другий працівники //
    
public class Main {
    public static void main(String[] args) {

        WorkerFixedSalary fixed = new WorkerFixedSalary("Андрій", 15000);
        WorkerHourlyWage hourly = new WorkerHourlyWage("Олег", 168, 98.57);

        fixed.salary();
        hourly.salary();
    }
}
