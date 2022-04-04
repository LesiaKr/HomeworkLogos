package first.home.variables;
//В банк поклали m - гривень під n-% відсотків річних. Яким буде вклад за K років.
// Користувач вводить : m -суму грошей , n - процентна ставка та k кількість років

import java.util.Scanner;

public class TaskInterest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть суму грошей: ");
        double m = sc.nextDouble();  //сума
        System.out.println("Введіть процентну ставку: ");
        double n = sc.nextDouble();  //відсоток
        System.out.println("Введіть кількість років: ");
        double k = sc.nextDouble();  //роки
        System.out.println("Ваш вклад становитиме: "+ m*(1+n/100*k));
    }
}
