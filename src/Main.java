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


    }

    public static void taskOne() {
        System.out.println("Задача 1");
        int invested = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + invested;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        System.out.println();
    }

    public static void taskTwo() {
        System.out.println("Задача 2");
        int i = 1;
        int start = 0;
        while (start < 10) {
            start = start + i;
            System.out.print(start + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void taskThree() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortalyty = 8;
        for (int year = 1; year <= 10; year++) {
            population = population + population * 17 / 1000 - mortalyty * 8 / 1000;
            System.out.println("Год " + year + " население составит " + population);
        }

        System.out.println();
    }

    public static void taskFour() {
        System.out.println("Задача 4");
        int startCapital = 15000;
        int total = 0;
        for (int month =1; total <= 12_000_000; month++) {
            total = total + startCapital *7 / 100;
            total = total + startCapital;
            System.out.println("Месяц " + month + " сумма " + total);
        }
        System.out.println();
    }

    public static void taskFive() {
        System.out.println("Задача 5");
        int startCapital = 15000;
        int total = 0;
        for (int month =1; total <= 12_000_000; month++ ) {
            total = total + startCapital *7 / 100;
            total = total + startCapital;
            if (month %6==0)
            System.out.println("Месяц " + month + " сумма " + total);
        }
        System.out.println();

    }

    public static void taskSix() {
        System.out.println("Задача 6");
        int months = 0;
        int total = 0;
        int year = 9;
        int startCapital = 15000;





    }

    public static void taskSeven() {
        System.out.println("Задача 7");


    }

    public static void taskEight() {
        System.out.println("Задача 8");

        System.out.println();

    }
}