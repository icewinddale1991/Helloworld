
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
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 2;
        var cat = 3.6;
        cat = cat + 2;
        var paper = 763789;
        paper = paper + 2;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        var weighOfOneBoxer = 78.2;
        System.out.println("Вес первого боксёра " + weighOfOneBoxer + " кг.");
        var secondBoxersWeight = 82.7;
        System.out.println("Вес вторго боксера " + secondBoxersWeight + " кг.");
        var totalWeightOfFighters = (weighOfOneBoxer + secondBoxersWeight);
        System.out.println("Общий вес бойцов " + totalWeightOfFighters + " кг.");
        var weightDifference = (secondBoxersWeight - weighOfOneBoxer);
        System.out.println("Разница в весе двух бойцов составляет " + weightDifference + " кг.");
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        var weightOfOneBoxer = 78.2;
        var secondBoxersWeight = 82.7;
        var totalWeight = (weightOfOneBoxer + secondBoxersWeight);
        var weightDifference = (secondBoxersWeight - weightOfOneBoxer);
        var overload = (weightDifference + totalWeight) % totalWeight;
        System.out.println("Разница в весе двух бойцов составляет " + weightDifference + " или " + overload);
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        var totalHors = 640;
        var everyEmployeeWorks = 8;
        var totalEmployees = (totalHors / everyEmployeeWorks);
        System.out.println("Всего работников в компании " + totalEmployees + " человек");
        var moreEmployees = 94;
        var employeesWithVisitors = (moreEmployees + totalEmployees);
        System.out.println("Теперь в компании работает " + employeesWithVisitors);
        var dividedBetweenEmployees = (totalEmployees / employeesWithVisitors);
        System.out.println("Если в компании работает " + employeesWithVisitors + " человек, то всего " + dividedBetweenEmployees + " часа работы может быть поделено между сотрудниками");
    }


}