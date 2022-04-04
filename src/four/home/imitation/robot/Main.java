package four.home.imitation.robot;
//Створити клас Robot i класи CoffeeRobot, RobotDancer, RobotCooker, які будуть нащадками
//Robot. Оголосити в Robot метод work(), в якому слід описати роботу яку буде виконувати
//кожен з роботів (тобто, метод повинен пронаслідуватись):
//• Для Robot, щоб на консоль виводився текст «Я Robot – я просто працюю».
//• Для CoffeeRobot, щоб на консоль виводився текст «Я CoffeeRobot – я варю каву».
//• Для RobotDancer, щоб на консоль виводився текст «Я RobotDancer – я просто танцюю».
//• Для RobotCooker, щоб на консоль виводився текст «Я RobotCooker – я просто готую».
//Створити в Main класі екземпляри вищеописаних класів і викликати до кожного з них метод
//work().
//Створити в Main класі масив класу Robot , заповнити масив екземплярами вищеописаних
//класів. Створити цикл for , пройтись по всіх елементах масиву і викликати для кожного
//елемент масиву метод work()
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCooker robotCooker = new RobotCooker();

        robot.work();
        coffeeRobot.work();
        robotDancer.work();
        robotCooker.work();

        System.out.println();

        Robot[] robotArray = new Robot [4];
        robotArray[0] = robot;
        robotArray[1] = coffeeRobot;
        robotArray[2] = robotDancer;
        robotArray[3] = robotCooker;

        for (int i = 0; i<robotArray.length; i++){
            robotArray[i].work();
        }
    }
}
