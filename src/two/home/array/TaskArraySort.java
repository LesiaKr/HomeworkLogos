package two.home.array;
//Посортуйте масив від найменшого до найбільшого

import java.util.Arrays;

public class TaskArraySort {
    public static void main(String[] args) {
        int[] array = {88,1,7,19,15,3};
        SortAndPrint(array);
    }
    public static void SortAndPrint(int[] m){
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
    }
}
