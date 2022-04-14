//Створити програму, яка буде обчислювати і виводити на екран суму двох цілих чисел, введених користувачем.
//Якщо користувач некоректно введе хоча б одне з чисел, то повідомляти про помилку.
package eight.home.exept;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number (integer):");
            int a = scanner.nextInt();
            System.out.println("Enter the second number (integer):");
            int b = scanner.nextInt();
            int sum = a+b;
            System.out.println("Сума = "+sum);
        } catch (Exception e) {
            System.err.println("Incorrectly entered data, please try again!");
        }
    }
}
