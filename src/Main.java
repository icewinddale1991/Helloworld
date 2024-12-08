
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
        long galaxy = 337922203987456l;
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
        long b = 987678965549l;
        double c =2.786;
        short d = 569;
        short e = -159;
        int f = -27897;
        byte g = 67;
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte LydmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkatreinaAndreevna = 30;
        short TotalPaper = 480;
        int StudentHavePapers = TotalPaper / (LydmilaPavlovna + AnnaSergeevna+ EkatreinaAndreevna);
        System.out.println("На каждого ученика расчитано " + StudentHavePapers + " листов бумаги" );
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte MachinePerfomancePerTwoMinutes = 16;
        byte HoursPerDay = 24;
        int PerfomancePer20Minutes = (MachinePerfomancePerTwoMinutes * 10);
        int PerfomancePerHours = (MachinePerfomancePerTwoMinutes * 30);
        int PerfomancePerDay = (PerfomancePerHours * HoursPerDay);
        int HoursPerThreeDays = (HoursPerDay * 3);
        int PerfomancePerThreeDays = (PerfomancePerHours * HoursPerThreeDays);
        int PerfomancePerMonth = (PerfomancePerDay * 30);
        System.out.println("За 20 минут машина произвела " + PerfomancePer20Minutes+ " штук бутылок" );
        System.out.println("За 1 день машина произвела " + PerfomancePerDay + " штук бутылок" );
        System.out.println("За 3 дня машина произвела " + PerfomancePerThreeDays+ " штук бутылок" );
        System.out.println("За месяц машина произвела " + PerfomancePerMonth + " штук бутылок" );
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte TotalCansOfPaint =120;
        byte WhitePaintOnTheRoom =2;
        byte BrownPaintOnTheRoom =4;
        int TotalCansForTheRoom = (WhitePaintOnTheRoom + BrownPaintOnTheRoom);
        int TotalClassesInTheSchool = (TotalCansOfPaint / TotalCansForTheRoom);
        int TotalWhitePaint = (TotalClassesInTheSchool * WhitePaintOnTheRoom);
        int TotalBrownPaint = (TotalClassesInTheSchool * BrownPaintOnTheRoom);
        System.out.println("В школе где " +TotalClassesInTheSchool + " классов нужно " + TotalWhitePaint + " банок белой краски и " + TotalBrownPaint + " банок коричневой краски");
        System.out.println();

    }
    public static void task6() {
        System.out.println("Задача 6");
        byte Bananas = 80;
        byte Milk = 105;
        byte IceCream = 100;
        byte Egg = 70;
        int WeightBananas = Bananas * 5;
        System.out.println("Вес бананов составляет " +WeightBananas+ " гр");
        int WeightMilk = Milk * 2;
        System.out.println("Вес молока составляет " +WeightMilk+ " гр.");
        int WeightIceCream = IceCream *2;
        System.out.println("Вес Мороженого составляет " +WeightIceCream+ " гр.");
        int EggWeight = Egg * 4;
        System.out.println("Вес яиц составляет " +EggWeight+ " гр.");
        int TotalBreakFastWeight = WeightBananas + WeightMilk + WeightIceCream + EggWeight;
        float TotalBreakFastWeightKg = (float) TotalBreakFastWeight/1000;
        System.out.println("Общий вес завтрака " + TotalBreakFastWeightKg + " кг.");
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7");
        short NeedLost = 7000;
        short InDay = 250;
        short InDayTwo = 500;
        int ResultDay = NeedLost/InDay;
        System.out.println("При потере " +InDay+ "гр потребуется " +ResultDay+ " дней");
        int ResultDayTwo = NeedLost/InDayTwo;
        System.out.println("При потере " +InDayTwo+ "гр потребуется " +ResultDayTwo+ " дней");
        int OnAverageDay = (ResultDay+ResultDayTwo)/2;
        System.out.println("В среднем потребуется " +OnAverageDay+ " дней для похудения");
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int MariaPerYear = 67760 * 12;
        int DenPerYear = 83690 * 12;
        int KrisPerYear = 76230 * 12;
        float MariaPerYearInc = (float) (MariaPerYear*1.1);
        float DenPerYearInc = (float) (DenPerYear*1.1);
        float KrisPerYearInc = (float) (KrisPerYear*1.1);
        float MariaOverage = (MariaPerYearInc - MariaPerYear);
        float DenOverage = (DenPerYearInc - DenPerYear);
        float KrisOverage = (KrisPerYearInc - KrisPerYear);
        System.out.println("Маша теперь получет "+MariaPerYearInc+" рублей доход вырос на "+MariaOverage);
        System.out.println("Денис теперь получет "+DenPerYearInc+" рублей доход вырос на "+DenOverage);
        System.out.println("Маша теперь получет "+KrisPerYearInc+" рублей доход вырос на "+KrisOverage);





    }
}