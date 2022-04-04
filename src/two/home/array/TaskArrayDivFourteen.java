package two.home.array;
//В масиві знаходяться числа від 1 до 100 включно. Ініціалізувати масив. Вивести лише числа які
//націло діляться на 14

public class TaskArrayDivFourteen {
    public  static void main (String[] args){
        int ar[] = new int[100];
        for (int i = 0; i < ar.length; i++)
            ar[i] = i + 1;
        for (int j = 0; j < ar.length; j++){
            if (ar[j] % 14 == 0){
                System.out.println(ar[j]);
            }
        }
    }
}
