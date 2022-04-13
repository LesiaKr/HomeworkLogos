package seven.home.enums;
//Написати консольну програму для роботи з Enums. Створити енум Сезони, в якому оголосити такі константи:
//Зима , Весна, Літо, Осінь.Створити енум Місяці, в якому створити 12 констант- місяці року(Січень, Лютий),
// оголосити змінну дні,та змінну сезон типу Сезон , як поле енума . Створити конструктор з визначеними
// параметрами в енумі Місяці,в який як параметри передати змінну дні та сезон. Описати getters до даних
// полів (дні, сезони). Створити консольне меню, в якому реалізувати наступні пункти :
//● Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити,щоб регістр букв був не важливим ).
//● Вивести всі місяці з такою ж порою року.
//● Вивести всі місяці які мають таку саму кількість днів.
//● Вивести на екран всі місяці які мають меншу кількість днів.
//● Вивести на екран всі місяці які мають більшу кількість днів.
//● Вивести на екран наступну пору року.
//● Вивести на екран попередню пору року.
//● Вивести на екран всі місяці які мають парну кількість днів.
//● Вивести на екран всі місяці які мають непарну кількість днів.
//● Вивести на екран чи введений з консолі місяць має парну кількість днів.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String scanData = scanner.next();

        for (Months m : Months.values()) {
            if (scanData.equalsIgnoreCase(m.name())) {
                System.out.println("1. SUCCESS! Such a month exists!");
                System.out.print("2. The same months of the season: ");

                for (Months month : Months.values()) {
                    if (m.getSeasons().equals(month.getSeasons())) {
                        System.out.print(month + "(" + month.getSeasons() + "), ");
                    }
                }
                System.out.print("\n3. The same amount of days: ");
                for (Months day : Months.values()) {
                    if (m.getDays() == day.getDays()) {
                        System.out.print(day + "(" + day.getDays() + "), ");
                    }
                }
                System.out.print("\n4. Smaller amount of days: ");
                for (Months day : Months.values()) {
                    if (m.getDays() > day.getDays()) {
                        System.out.print(day + "(" + day.getDays() + "), ");
                        break;
                    } else {
                        System.out.print("No less days");
                        break;
                    }
                }
                System.out.print("\n5. More amount of days: ");
                for (Months day : Months.values()) {
                    if (m.getDays() < day.getDays()) {
                        System.out.print(day + "(" + day.getDays() + "), ");
                        break;
                    } else {
                        System.out.print("No more days");
                        break;
                    }
                }
                System.out.print("\n6. The next season: не виконано");
                //  for (Seasons s : Seasons.values()) {
                //      System.out.print(s + " ");
                //  }
                System.out.print("\n7. The previous season: не виконано");
                //  for (Seasons s : Seasons.values()) {
                //      System.out.print(s + " ");
                //  }
                System.out.print("\n8. All months with an even number of days: ");
                for (Months day : Months.values()) {
                    if (day.getDays() % 2 == 0) {
                        System.out.print(day + "(" + day.getDays() + "), ");
                    }
                }
                System.out.print("\n9. All months with an odd number of days: ");
                for (Months day : Months.values()) {
                    if (day.getDays() % 2 != 0) {
                        System.out.print(day + "(" + day.getDays() + "), ");
                    }
                }
                System.out.print("\n10. The month entered from the console has an even number of days: ");
                for (Months day : Months.values()) {
                    if (m.getDays() == day.getDays()) {
                        if (day.getDays() % 2 == 0) {
                        }
                        System.out.print("No!");
                        break;
                    } else if (day.getDays() % 2 != 0) {
                    }
                    System.out.print("Yes!");
                    break;
                }
            }
        }
    }
}
