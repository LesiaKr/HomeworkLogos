package three.home.oop.circle;
//Створити клас Коло. Описати його двома полями: радіус , діаметр.
//Введений може бути дробовим.Написати два методи які будуть виводити на екран площу кола
// і довжину кола. Для площі використати параметр - діаметр.
// Для довжини кола використати радіус

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Довжина кола = " + circle.circleLength(15));
        System.out.println("Площа кола = " + circle.circleArea(5));
    }
}
