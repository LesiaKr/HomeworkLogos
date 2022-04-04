package four.home.imitation.animal;

public class Animal {
    private String name;
    private int speed;
    private int age;

    public Animal(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public void viewAnimalInfo (String name, int speed, int age) {
        System.out.println("Назва тварини = " + name + ", Швидкість тварини = " + speed + " км/год, Вік тварини  = " + age + " років");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
