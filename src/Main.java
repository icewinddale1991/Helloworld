import java.time.Year;

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
        int desiredSum = 2_459_000;
        int sum = 0;
        int amount = 15000;
        int month = 0;
        while (sum < desiredSum) {
            sum += amount;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum);
        }

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
        int currenYear = 2024;
        for (int year = currenYear; year < currenYear + 10; year++) {
            population += population * fertility / 1000 - population * mortalyty / 1000;
            System.out.println("Год " + year + ", население составит " + population);
        }

        System.out.println();
    }

    public static void taskFour() {
        System.out.println("Задача 4");
        int desiredSum = 12_000_000;
        int dep = 15000;
        double precent = 7D / 100;
        int month = 0;
        while (dep < desiredSum) {
            dep = (int) (dep * (1 + precent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений составила " + dep);
        }
        System.out.println();
    }

    public static void taskFive() {
        System.out.println("Задача 5");
        int desiredSum = 12_000_000;
        int dep = 15000;
        double precent = 7D / 100;
        int month = 0;
        while (dep < desiredSum) {
            dep = (int) (dep * (1 + precent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составила " + dep);
            }
        }
        System.out.println();

    }

    public static void taskSix() {
        System.out.println("Задача 6");
        int months = 12 * 9;
        int dep = 15000;
        double precent = 7D / 100;
        int month = 0;
        while (month < months) {
            dep = (int) (dep * (1 + precent));
            month++;

            System.out.println("Месяц " + month + ", сумма накоплений составила " + dep);
        }

    }

    public static void taskSeven() {
        System.out.println("Задача 7");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница " + friday + "е число, Нужно подготовить отчеты");
            friday += 7;
        }


    }

    public static void taskEight() {
        System.out.println("Задача 8");
        int currentYar = 2024;
        int period = 79;
        int startYear = 0;
        int starSeeing = currentYar - 200;
        int endSeeing = currentYar + 100;
        for (int year = startYear; year < endSeeing; year += period) {
            if (year > starSeeing)
                System.out.println(year);
        }

        System.out.println();

    }
}