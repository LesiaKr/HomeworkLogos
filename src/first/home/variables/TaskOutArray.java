package first.home.variables;
//Користувач задає елементи масиву певного розміру (розмір масиву вибирає програміст).
// Ваше завдання вивести масив, який ввів користувач, а потім вивести масив у зворотньому порядку.

import java.util.Arrays;
import java.util.Scanner;

public class TaskOutArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 5 цілих чисел: ");
        int array[] = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Ви ввели: " + Arrays.toString(array));
        for (int i = 0; i < 2; i++){
            int t = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = t;
        }
        System.out.println("У зворотньому порядку: ");
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
