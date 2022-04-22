package ten.home.regexs;
//Користувач вводить слова з консолі, вивести лише ті, що починаються на
//“a”.
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter a sentence in a few words:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\p{L}+");
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            String word = matcher.group();
            if (word.toLowerCase().startsWith("a"))
                System.out.println(word);
        }
    }
}
