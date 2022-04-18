package nine.home.strings;
//        а) Ініціалізувати стрічку : String str = "I like Java !!!".
//        б) Роздрукувати останній символ рядка. Використовуємо метод
//        в) Перевірити, чи закінчується ваша рядок підрядком "!!!".
//        г) Перевірити, чи починається ваша рядок підрядком "I like".
//        д) Перевірити, чи містить ваша рядок підрядок "Java".
//        e) Знайти позицію підрядка "Java" в рядку "I like Java !!!".
//        ж) Замінити всі символи "а" на "о".
//        з) Перетворіть рядок до верхнього регістру.
//        і) Перетворіть рядок до нижнього регістру.
//        к) Вирізати рядок Java c допомогою методу String.substring() .
public class Task1 {
    public static void main(String[] args) {
        String str = "I like Java !!!";

        System.out.println(str.charAt(14));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a','o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(7,11));
    }
}
