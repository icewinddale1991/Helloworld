//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Helloworld!");
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        taskSix();
        taskSeven();
        taskEight();
        taskNine();
        taskTen();


    }

    public static void taskOne() {
        System.out.println("Задача 1");
        for (int i = 1; i < 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }

    public static void taskTwo() {
        System.out.println("Задача 2");
        {
            for (int i = 10; i > 0; i = i - 1) {
                System.out.println("Итерация цикла " + i);
            }
        }
        System.out.println();
    }

    public static void taskThree() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println();
    }

    public static void taskFour() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }

    public static void taskFive() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

    }

    public static void taskSix() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

    }

    public static void taskSeven() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

    }

    public static void taskEight() {
        System.out.println("Задача 8");
        int postponed = 29900;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + postponed;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

    }

    public static void taskNine() {
        System.out.println("Задача 9");
        int postponed = 29900;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + postponed;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

    }

    public static void taskTen() {
        System.out.println("Задача 10");
        for (int i = 1; i <=10; i++) {
            System.out.println(" 2* " +i+ " = " +2*i);
        }

    }

}