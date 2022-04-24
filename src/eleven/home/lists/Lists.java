package eleven.home.lists;
/*Користувач з консолі має вводити слова доти, доки не введе “break”,
        всі слова записуються в List.
        Написати функцію для :
        ● виведення користувачу всіх слова, які він ввів!
        ● виведення слів, які починаються на “s”!
        ● виведення слів, які мають кількість букв більше ніж 5!*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        List<String> counter = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the words: ");
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("break")){
            list.add(input);
            System.out.println("Enter a word. \nEnter 'break', if you want to complete.");
            input = scanner.nextLine();
        }
        System.out.println("You entered: " + list);

        String prefix = "s";
        for(String s: list) {
            if(s.startsWith(prefix)) {
                result.add(s);
            }
        }
        System.out.println("Words starting with letters 's': " + result);

        for(String f: list) {
            if(f.length()>5) {
                counter.add(f);
            }
        }
        System.out.println("Words with more than 5 letters: " + counter);
    }
}
