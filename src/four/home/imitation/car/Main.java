package four.home.imitation.car;
//Створити клас Кермо, Колесо, Кузов - описати дані класи(getters, setters, toString). Всі поля
//повинні бути приватними. Додати методи які б виконували певні функції з полями, тобто збільшували
//розмір колеса у декілька разів, чи змінювали діаметр керма і т.д.. Створити клас Машина, який
//матиме деякі свої поля та об’єкти класу Кермо, Кузов,Колесо - як поля класу. Додати методи, які би
//змінювали стан полів класу , для виконання певних функцій, описати даний клас(getters, setters,
//toString). Всі поля повинні бути параметрами в конструкторі. В мейн методі , створити об`єкт
//Машина, запустити всі його методи.
public class Main {
    public static void main(String[] args) {
        SteeringWheel sw = new SteeringWheel(40.5, "Bip!");
        Wheel wheel = new Wheel(13, 145, "Spring");
        CarBody carBody = new CarBody("Red");
        Car car = new Car(500, "diesel", sw, wheel, carBody);

        System.out.println(car);

        car.setEnginePower(1200);
        car.setFuelType("A-95");
        sw.setDiameter(sw.doublingDiameter(30));
        sw.setSignal("Ops!");
        wheel.setDiskDiameter(wheel.plusDiameter(13));
        wheel.setTireSize(wheel.sizeTire(145));
        wheel.setSeason("Winter");
        carBody.setColor("White");

        System.out.println(car);
    }
}
