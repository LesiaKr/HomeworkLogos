package first.home.variables;
//Створити двовимірний масив, який буде мати 5 рядків і 7 стовпців і заповнити
//його рандомними(Math.random()) цифрами з проміжку [-2, 75]
import java.util.Random;

public class TaskTwoArray {
    public static void main(String[] args) {
        int[][] mar = new int[5][7];
        Random rand = new Random();
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 7; j++) mar[i][j] = rand.nextInt(-2,75);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++)
                System.out.print(mar[i][j] + "   ");
            System.out.println();
        }
    }
}
