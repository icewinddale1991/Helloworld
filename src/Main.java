
public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        taskSix();
        taskSeven();
    }

    public static void taskOne() {
        System.out.println("Задача 1");
        int age = 13;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия нужно немного подождать");
        }
        System.out.println();
    }

    public static void taskTwo() {
        System.out.println("Задача 2");
        int temperature = 18;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов можно идти без шапки");
        }
        System.out.println();
    }

    public static void taskThree() {
        System.out.println("Задача 3");
        int speed = 45;
        if (speed >60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }
        System.out.println();
    }

    public static void taskFour() {
        System.out.println("Задача 4");
        int age =23;
        if (age >=2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + " то ему можно ходить в детский сад");
        }
        else if (age >=7 && age ==18) {
            System.out.println("Если возраст человека равен " + age+ " то ему можно ходить в школу");
        }
        if (age>18 && age <=24) {
            System.out.println("Если возраст человека равен " + age + " тоему нужно ходить в университет");
        } else if ( age >24 ) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно хождить на работу");
        }
        System.out.println();
    }

    public static void taskFive() {
        System.out.println("Задача 5");
        int ageChild = 16;
        if (ageChild <5) {
            System.out.println("Если возраст ребёнка равен " +ageChild+  " он не может кататься на аттракционе");
        }
        else if (ageChild >5  && ageChild<14) {
            System.out.println("Если возраст ребёнка равен " + ageChild + " Можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребёнка равен " +ageChild+ " можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();

    }

    public static void taskSix() {
        System.out.println("Задача 6");
        int carrigeCapacity = 1;
        ;
        if (carrigeCapacity <=60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (carrigeCapacity > 60 && carrigeCapacity <102) {
        System.out.println("В вагоне остались стоячие места");
        } else if (carrigeCapacity >=102 ) {
            System.out.println("Вагон полностью забит");
        }
        System.out.println();
    }

    public static void taskSeven() {
        System.out.println("Задача 7");
        int one = 1;
        int two =2;
        int three =3;
        if (one > two && one > three && one!= two && one != three ) {
            System.out.println("One наибольшее число");
        }
        if (two > one && two > three && two != one && two != three)  {
            System.out.println("two наибольшее число");
        } else if (three > one && three > two &&three != one && three != two) {
            System.out.println("three наибольшее число");
        }

    }

}