package two.home.array;
//Вивести лише числа, які повторюються в масиві більше ніж 1 раз
import java.util.Arrays;

public class TaskArrayDuplicate {
    public static void main(String[] args) {
        int array[] = {23,1,13,24,65,1,14,8,21,14,13,67,21,55,23};
        Arrays.sort(array);

        for (int i = 0; i < array.length -1; i++){
            for (int j = i + 1; j < array.length; j++){
                if ((array[i] == (array[j])) && (i != j)){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
