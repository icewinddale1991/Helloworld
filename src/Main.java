
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte apple = 12;
        short money = 27594;
        int cash = 2147483646;
        long galaxy = 337922203987456L;
        float part = 0.75f;
        double morepart = 5.358;

        System.out.println("Значение переменной яблоки с типом byte равно "+apple );
        System.out.println("Значение переменной деньги с типом short равно "+money);
        System.out.println("Значение переменной наличные с типом cash равно "+cash);
        System.out.println("Значение переменной галактики с типом long равно "+galaxy);
        System.out.println("Значение переменной часть с типом float равно "+part);
        System.out.println("Значение переменной еще часть с типом double равно "+morepart);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c =2.786;
        short d = 569;
        short e = -159;
        int f = -27897;
        byte g = 67;
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lydmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekatreinaAndreevna = 30;
        short totalPaper = 480;
        int paperLeft = (lydmilaPavlovna + annaSergeevna+ ekatreinaAndreevna);
        System.out.println("На каждого ученика расчитано " + paperLeft + " листов бумаги" );
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte perfomancePerTwoMinutes = 16;
        byte hoursPerDay = 24;
        int perfomancePer20Minutes = (perfomancePerTwoMinutes * 10);
        int perfomancePerHours = (perfomancePerTwoMinutes * 30);
        int perfomancePerDay = (perfomancePer20Minutes * hoursPerDay);
        int hoursPerThreeDays = (hoursPerDay * 3);
        int perfomancePerThreeDays = (perfomancePerHours * hoursPerThreeDays);
        int perfomancePerMonth = (perfomancePerThreeDays * 30);
        System.out.println("За 20 минут машина произвела " + perfomancePerMonth+ " штук бутылок" );
        System.out.println("За 1 день машина произвела " + perfomancePerHours + " штук бутылок" );
        System.out.println("За 3 дня машина произвела " + perfomancePerDay+ " штук бутылок" );
        System.out.println("За месяц машина произвела " + perfomancePer20Minutes + " штук бутылок" );
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte TotalCansOfPaint =120;
        byte whitePaintOnTheRoom =2;
        byte brownPaintOnTheRoom =4;
        int totalCansForTheRoom = (whitePaintOnTheRoom + brownPaintOnTheRoom);
        int totalClassesInTheSchool = (brownPaintOnTheRoom  / totalCansForTheRoom);
        int totalWhitePaint = (totalClassesInTheSchool * whitePaintOnTheRoom);
        int totalBrownPaint = (totalClassesInTheSchool * brownPaintOnTheRoom);
        System.out.println("В школе где " +totalClassesInTheSchool + " классов нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        System.out.println();

    }
    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int weightBananas = bananas * 5;
        System.out.println("Вес бананов составляет " +weightBananas+ " гр");
        int weightMilk = milk * 2;
        System.out.println("Вес молока составляет " +weightMilk+ " гр.");
        int weightIceCream = iceCream *2;
        System.out.println("Вес Мороженого составляет " +weightIceCream+ " гр.");
        int eggWeight = egg * 4;
        System.out.println("Вес яиц составляет " +eggWeight+ " гр.");
        int totalBreakFastWeight = weightBananas + weightMilk + weightMilk + eggWeight;
        float totalBreakFastWeightKg = (float) totalBreakFastWeight/1000;
        System.out.println("Общий вес завтрака " + totalBreakFastWeightKg + " кг.");
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7");
        short needLost = 7000;
        short inDay = 250;
        short inDayTwo = 500;
        int ResultDay = needLost/inDay;
        System.out.println("При потере " +inDay+ "гр потребуется " +ResultDay+ " дней");
        int ResultDayTwo = needLost/inDayTwo;
        System.out.println("При потере " +inDayTwo+ "гр потребуется " +ResultDayTwo+ " дней");
        int OnAverageDay = (ResultDay+ResultDayTwo)/2;
        System.out.println("В среднем потребуется " +OnAverageDay+ " дней для похудения");
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int mariaPerYear = 67760 * 12;
        int denPerYear = 83690 * 12;
        int krisPerYear = 76230 * 12;
        float mariaPerYearInc = (float) (mariaPerYear*1.1);
        float denPerYearInc = (float) (denPerYear*1.1);
        float krisPerYearInc = (float) (krisPerYear*1.1);
        float mariaOverage = (mariaPerYearInc - mariaPerYear);
        float denOverage = (denPerYearInc - denPerYear);
        float krisOverage = (krisPerYearInc - krisPerYear);
        System.out.println("Маша теперь получет "+mariaPerYearInc+" рублей доход вырос на "+mariaOverage);
        System.out.println("Денис теперь получет "+denPerYearInc+" рублей доход вырос на "+denOverage);
        System.out.println("Маша теперь получет "+krisPerYearInc+" рублей доход вырос на "+krisOverage);





    }
}