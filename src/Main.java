
public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();


    }

    public static void taskOne() {
        System.out.println("Задача 1");
        for (int i = 1; i < 10; i = i + 1) {
            System.out.println( "Итерация цикла " +i);
        }
        System.out.println();
    }

    public static void taskTwo() {
        System.out.println("Задача 2");{
            for (int i = 10; i >0; i = i - 1) {
            System.out.println("Итерация цикла " +i);
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
        for (int i = 10; i >=-10; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println();
    }

    public static void taskFive() {
        System.out.println("Задача 5");

        System.out.println();

    }
}

