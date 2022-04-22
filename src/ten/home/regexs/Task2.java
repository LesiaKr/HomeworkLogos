package ten.home.regexs;
//Зробити валідацію для емейл-адрес, зберігати лише ті, які закінчуються на
//@gmail.com
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email: ");
        String em = scanner.next();

        Pattern pattern = Pattern.compile("@gmail\\.com$");
        Matcher matcher = pattern.matcher(em);

        System.out.println("Your email: " + matcher.find());
    }
}
