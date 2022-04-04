package two.home.array;
//Вивести індекси найбільшого, найменшого елеманта з масиву

public class TaskArrayMaxMin {
    public static void main(String[] args) {
        int[] new_arr2 = {1,222,3,4,5,62,5555};

        int max = new_arr2[0];
        int min = new_arr2[0];
        for(int i = 1; i< new_arr2.length; i++) {
            if (new_arr2[i] > max) max = new_arr2[i];
            if (new_arr2[i] < min) min = new_arr2[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
