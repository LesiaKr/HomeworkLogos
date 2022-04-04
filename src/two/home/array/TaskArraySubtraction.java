package two.home.array;
//Є два довільні масиви. Створити та вивести третій масив, кожен елемент якого буде рівний
//різниці елементів першого та другого масивів.
//C = A - B , С - елемент третього масиву, А - елемент першого, В - елемент другого

public class TaskArraySubtraction {
    public static void main(String[] args) {
        int[] arrayA = {5, 54, 22, 18, 283, 40, 770};
        int[] arrayB = {1, 27, 311, 15, 172, 15, 88};
        int[] arrayC = new int[7];

        arrayC[0] = arrayA[0] - arrayB[0];
        arrayC[1] = arrayA[1] - arrayB[1];
        arrayC[2] = arrayA[2] - arrayB[2];
        arrayC[3] = arrayA[3] - arrayB[3];
        arrayC[4] = arrayA[4] - arrayB[4];
        arrayC[5] = arrayA[5] - arrayB[5];
        arrayC[6] = arrayA[6] - arrayB[6];

        for(int n : arrayC) {
            System.out.println(n);
        }
    }
}
