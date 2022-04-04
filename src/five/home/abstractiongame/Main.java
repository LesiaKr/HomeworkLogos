package five.home.abstractiongame;
//Зробити міні-гру - битва. Створити одну сутність -
//шаблонний варіант воїна. Зробити декілька типів воїнів наслідників. Кожен з них має свої особливості , наприклад
//hp, зброя і т.д. Тут потрібно проявити свою фантазію і
//додавати класи, які хочеться. Потім має бути битва. Воїни можуть атакувати, якщо вони
//атакують, життя зменшується. На кожному етапі показувати інфу
public class Main {
    public static void main(String[] args) {
        WarriorOne warriorOne = new WarriorOne("Воїн №1", "ніж", 200, 1000);
        System.out.println(warriorOne.getName() + "\nhp: " + warriorOne.getHp() + "\nзброя: " + warriorOne.getWeapon()
                + "(" + warriorOne.getPower() + ")");

        System.out.println();

        WarriorTwo warriorTwo = new WarriorTwo("Воїн №2", "шабля", 300, 800);
        System.out.println(warriorTwo.getName() + "\nhp: " + warriorTwo.getHp() + "\nзброя: " + warriorTwo.getWeapon()
                + "(" + warriorTwo.getPower() + ")");

        System.out.println();

        WarriorThree warriorThree = new WarriorThree("Воїн №3", "пістолет", 500, 500);
        System.out.println(warriorThree.getName() + "\nhp: " + warriorThree.getHp() + "\nзброя: " + warriorThree.getWeapon()
                + "(" + warriorThree.getPower() + ")");

        System.out.println("\nБитва!!!\n");

        warriorTwo.attack(warriorOne);
        System.out.println();

        warriorOne.attack(warriorThree);
        System.out.println();

        warriorThree.attack(warriorOne);
        System.out.println();

        warriorTwo.attack(warriorThree);
        System.out.println();

        warriorTwo.attack(warriorOne);
        System.out.println();

        System.out.println("Битва закінчилась! Переміг " + warriorTwo.getName());
    }
}
