/* Створити свій Exception(MyException). Створити клас Methods, Описати в ньому методи , які б
розраховували додавання, віднімання, множення, ділення двох змінних . При цьому врахувати :
Якщо a<0 і b<0 викидаємо IllegalArgumentException
Якщо a=0 і b!=0 або a!=0 і b=0 викидаємо ArithmeticException
Якщо a=0 і b=0 викидаємо IllegalAccessException
Якщо a>0 і b>0 викидаємо MyException
Протестувати всі можливі варіанти, і вивести все на консоль.*/
package eight.home.exept.myexcept;

import eight.home.exept.myexcept.Methods;
import eight.home.exept.myexcept.MyException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the first integer:");

        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            System.out.println("Enter the second integer:");

            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                Methods calc = new Methods(a, b);
                Methods.viewCalcResult(calc.plus());
                Methods.viewCalcResult(calc.minus());
                Methods.viewCalcResult(calc.multiply());
                Methods.viewCalcResult(calc.divide());
            }
            else
                System.err.println("Mistake! It was necessary to enter a whole number.");
        }
        else
            System.err.println("Mistake! It was necessary to enter a whole number.");
    }
}
